/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.gv.egiz.smcc;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Set;

import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;

import at.gv.egiz.smcc.util.LinuxLibraryFinder;
import at.gv.egiz.smcc.util.SmartCardIO;

/**
 *
 * @author Ricardo Vaz - Linkare TI
 */
public class Magic2 {
    public static void main(String args[]) throws Exception {
        
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Linux")) {
          File libFile;
          try {
            libFile = LinuxLibraryFinder.getLibraryPath("pcsclite", "1");
            System.setProperty("sun.security.smartcardio.library", libFile.getAbsolutePath());
          } catch (java.io.FileNotFoundException e) {
              System.out.println("PC/SC library not found"+ e);
          }
        }
        
        SmartCardIO smartCardIO = new SmartCardIO();
        
        Set<Map.Entry<CardTerminal, Card>> entrySet = smartCardIO.getCards().entrySet();
        
        for (Map.Entry<CardTerminal, Card> entrySet1 : entrySet) {
            SignatureCard signatureCard = SignatureCardFactory.getInstance().createSignatureCard(entrySet1.getValue(), entrySet1.getKey());
//            System.out.println(new String(signatureCard.getCertificate(null, null)));
            
            byte[] citizenDataByteArray = signatureCard.getCitizenData(SignatureCard.KeyboxName.CERTIFIED_KEYPAIR, null);
            String citizenData = new String(citizenDataByteArray);
            
//            byte[] jpge2000StartCodeByteArray = new byte[] {(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x6a, (byte) 0x50,
//                (byte) 0x20, (byte) 0x20, (byte) 0x0d, (byte) 0x0a, (byte) 0x87, (byte) 0x0a};
//            String jpge2000StartCode = new String(jpge2000StartCodeByteArray);
//            
//            int indexStartJpeg200 = citizenData.indexOf(jpge2000StartCode);
//            RandomAccessFile jpeg2000File = new RandomAccessFile(new File("/home/rvaz/Desktop/coiso.jp2"), "rw");
//            jpeg2000File.write(citizenDataByteArray, indexStartJpeg200, citizenDataByteArray.length - indexStartJpeg200);
//
            PTEID_PIC pteid_pic = PTEID_PIC.parsePic(citizenDataByteArray);
            
            RandomAccessFile jpeg2000File = new RandomAccessFile(new File("/home/rvaz/Documents/assinare/segundaAdjudicacaoCM@Pombal/foto.jp2"), "rw");
            jpeg2000File.write(pteid_pic.picture);
            
            System.out.println(PTEID_ID.parseId(citizenDataByteArray));
        }
        
    }
    
}
