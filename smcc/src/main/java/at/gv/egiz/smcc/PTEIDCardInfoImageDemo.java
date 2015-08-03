/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.gv.egiz.smcc;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;
import javax.xml.parsers.ParserConfigurationException;

import at.gv.egiz.smcc.util.LinuxLibraryFinder;
import at.gv.egiz.smcc.util.SmartCardIO;


/**
 *
 * @author Ricardo Vaz - Linkare TI
 */
import at.gv.egiz.smcc.pin.gui.PINGUI;

public class PTEIDCardInfoImageDemo {

    public static void main(String args[]) throws Exception {
        loadPCSCLibrary();
        Set<Map.Entry<CardTerminal, Card>> entrySet = getAllAvailableCards();
//        System.out.println(getAvailableInfoFromCards(entrySet));
        System.out.println(getCMPombalInfoFromCards(entrySet));
    }

    public static LinkedHashMap<String, String> getAvailableInfoFromCards(Set<Map.Entry<CardTerminal, Card>> entrySet) throws CardNotSupportedException, InterruptedException, SignatureCardException, FileNotFoundException, IOException {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
        
        for (Map.Entry<CardTerminal, Card> entrySet1 : entrySet) {
            SignatureCard signatureCard = SignatureCardFactory.getInstance().createSignatureCard(entrySet1.getValue(), entrySet1.getKey());

            byte[] citizenData = signatureCard.getCitizenData(null, new ConsolePINGUI());
            
            PTEID_ID pteid_id = PTEID_ID.parseId(citizenData);
            PTEID_PIC pteid_pic = PTEID_PIC.parsePic(citizenData);
            //TODO:save pteid_pic in the appropriate FILE or map value????
            RandomAccessFile jpeg2000File = 
                    new RandomAccessFile(new File("/home/rvaz/Documents/assinare/segundaAdjudicacaoCM@Pombal/foto.jp2"), "rw");
            jpeg2000File.write(pteid_pic.picture);
            
            byte[] citizenAddr = signatureCard.getCitizenAddr(null, new ConsolePINGUI());
            PTEID_ADDR pteid_addr = PTEID_ADDR.parseAddr(citizenAddr);
            
//            System.out.println(new String(citizenData));
            
            result.putAll(pteid_id.getAllInfo());
            result.putAll(pteid_addr.getAllInfo());
        }
        return result;
    }

    public static LinkedHashMap<String, String> getCMPombalInfoFromCards(Set<Map.Entry<CardTerminal, Card>> entrySet) throws CardNotSupportedException, InterruptedException, SignatureCardException, FileNotFoundException, IOException, ParserConfigurationException {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
        
        for (Map.Entry<CardTerminal, Card> entrySet1 : entrySet) {
            SignatureCard signatureCard = SignatureCardFactory.getInstance().createSignatureCard(entrySet1.getValue(), entrySet1.getKey());

            byte[] citizenData = signatureCard.getCitizenData(null, new ConsolePINGUI());
            
            PTEID_ID pteid_id = PTEID_ID.parseId(citizenData);
            PTEID_PIC pteid_pic = PTEID_PIC.parsePic(citizenData);
            //saveJPEG2000(pteid_pic);
                        
            convertAndSaveJpeg2000Jpeg(pteid_pic);
            
            byte[] citizenAddr = signatureCard.getCitizenAddr(null, new ConsolePINGUI());
            PTEID_ADDR pteid_addr = PTEID_ADDR.parseAddr(citizenAddr);
            
//             System.out.println(new String(citizenAddr));
            
            result.putAll(pteid_id.getCMPombalInfo());
            result.putAll(pteid_addr.getAllInfo());
        }
        return result;
    }

    private static void saveJPEG2000(PTEID_PIC pteid_pic) throws IOException, FileNotFoundException {
        File file = new File("/home/rvaz/Documents/assinare/segundaAdjudicacaoCM@Pombal/foto.jp2");
        RandomAccessFile jpeg2000File =
                new RandomAccessFile(file, "rw");
        jpeg2000File.write(pteid_pic.picture);
        
        jpeg2000File.close();
    }

    private static void convertAndSaveJpeg2000Jpeg(PTEID_PIC pteidPic) throws ParserConfigurationException, IOException, CancelledException {
        //from addPicAttributes middleware online
        File fileConverted = new File("/home/rvaz/Documents/assinare/segundaAdjudicacaoCM@Pombal/fotoConverted.jpeg");

        try {
            BufferedImage bi = ImageIO.read(new ByteArrayInputStream(pteidPic.picture));
            ImageIO.write(bi, "jpeg", fileConverted);
        } catch (IllegalArgumentException ex) {
            /*
             * ImageIO is a very naughty API that likes to throw IllegalArgumentExceptions
             * even for classpath or internal configuration errors. Hence, we catch those
             * here to prevent further damage to the application.
             */
            throw new CancelledException("Erro ao converter a foto para JPEG", ex);
        }

    }

    public static Set<Map.Entry<CardTerminal, Card>> getAllAvailableCards() {
        SmartCardIO smartCardIO = new SmartCardIO();
        Set<Map.Entry<CardTerminal, Card>> entrySet = smartCardIO.getCards().entrySet();
        return entrySet;
    }

    public static void loadPCSCLibrary() throws FileNotFoundException {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Linux")) {
            File libFile;
            try {
                libFile = LinuxLibraryFinder.getLibraryPath("pcsclite", "1");
                System.setProperty("sun.security.smartcardio.library", libFile.getAbsolutePath());
            } catch (java.io.FileNotFoundException e) {
                System.out.println("PC/SC library not found" + e);
                throw e;
            }
        }
    }

    

    public static class ConsolePINGUI implements PINGUI {

        @Override
        public void allKeysCleared() {
        }

        @Override
        public void correctionButtonPressed() {
        }

        @Override
        public void enterPIN(PinInfo spec, int retries) throws CancelledException,
                InterruptedException {
        }

        @Override
        public void enterPINDirect(PinInfo spec, int retries)
                throws CancelledException, InterruptedException {
        }

        @Override
        public void validKeyPressed() {
        }

        @Override
        public char[] providePIN(PinInfo pinSpec, int retries)
                throws CancelledException, InterruptedException {
            System.out.print("Enter " + pinSpec.getLocalizedName() + ": ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String pin;
            try {
                pin = in.readLine();
            } catch (IOException e) {
                throw new CancelledException(e);
            }
            if (pin == null || pin.length() == 0) {
                throw new CancelledException();
            }
            return pin.toCharArray();
        }

        //the following code is for getting pin from console without being seen and 
        //without being saved in a String which is a security risk
        //however for IDE the System.console() returns null therefore this cannot be used
//        @Override
//        public char[] providePIN(PinInfo pinSpec, int retries)
//                throws CancelledException, InterruptedException {
//            Console cnsl = System.console();
//            char[] pin = null;
//
//            // if console is not null
//            if (cnsl != null) {
//                // read password into the char array
//                pin = cnsl.readPassword("Enter " + pinSpec.getLocalizedName() + ": ");
//                // prints
//                System.out.println("Pin is: " + pin);
//
//                if (pin == null || pin.length == 0) {
//                    throw new CancelledException();
//                }
//            } else {
//                throw new CancelledException();
//            }
//
//            return pin;
//        }

    }

}
