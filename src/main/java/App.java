import models.CaesarCipher;

import java.io.Console;


public class App {
    public static void main(String[] args) {
        // Input for Encryption.
        Console myConsole = System.console();
        System.out.println("Enter the text to encrypt");
        String inputtedText = myConsole.readLine();
        System.out.println("Enter shift key");
        String shiftKey = myConsole.readLine();
        int encryptionKey = Integer.parseInt(shiftKey);
        CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedText, encryptionKey);
        String encrypted = createdCaesarCipher.cipherEncryption();
        System.out.println("ENCRYPTION:" + encrypted);
        System.out.println("-----------------");

        // Input for Decryption.
        System.out.println("Enter Encrypted Text");
        String encryptedText = myConsole.readLine();
        System.out.println("Enter shift key");
        String decryptShiftKey = myConsole.readLine();
        int decryptionKey = Integer.parseInt(decryptShiftKey);
        CaesarCipher createdCaesarCipher_2 = new CaesarCipher(encryptedText, decryptionKey);
        String decrypted = createdCaesarCipher_2.cipherDecryption();
        System.out.println("DECRYPTION:" + decrypted);
        System.out.println("------------------");
    }
}
