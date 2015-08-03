/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.gv.egiz.smcc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
import at.gv.egiz.smcc.pin.gui.PINGUI;

public class Magic {

    public static void main(String args[]) throws Exception {

        String osName = System.getProperty("os.name");
        if (osName.startsWith("Linux")) {
            File libFile;
            try {
                libFile = LinuxLibraryFinder.getLibraryPath("pcsclite", "1");
                System.setProperty("sun.security.smartcardio.library", libFile.getAbsolutePath());
            } catch (java.io.FileNotFoundException e) {
                System.out.println("PC/SC library not found" + e);
            }
        }

        SmartCardIO smartCardIO = new SmartCardIO();

        Set<Map.Entry<CardTerminal, Card>> entrySet = smartCardIO.getCards().entrySet();

        for (Map.Entry<CardTerminal, Card> entrySet1 : entrySet) {
            SignatureCard signatureCard = SignatureCardFactory.getInstance().createSignatureCard(entrySet1.getValue(), entrySet1.getKey());
            byte[] citizenAddr = signatureCard.getCitizenAddr(null, new ConsolePINGUI());
//            System.out.println(new String(signatureCard.getCertificate(null, null)));
            PTEID_ADDR pteid_addr = PTEID_ADDR.parseAddr(citizenAddr);
            
//            System.out.println(new String(citizenAddr));
            System.out.println(pteid_addr);
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

    }

}
