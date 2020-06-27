import models.CaesarCipher;

import java.io.Console;


public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter the text to encrypt");
        String inputtedText = myConsole.readLine();
        System.out.println("Enter shift key");
        String shiftKey = myConsole.readLine();
        int encryptionKey = Integer.parseInt(shiftKey);
        CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedText, encryptionKey);
        String encrypted = createdCaesarCipher.cipherEncryption();
        System.out.println("ENCRYPTION:" + encrypted);
    }
}
