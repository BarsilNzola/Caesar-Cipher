import models.CaesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programmRunning = true;
        System.out.println("CAESAR CIPHER");
        while (programmRunning) {
            System.out.println("Enter 1 for Encryption and Decryption, 2 to Exit Program");
            String choice = bufferedReader.readLine();
            if (choice.equals("1")) {
                // Input for Encryption.
                System.out.println("Enter the text to encrypt");
                String inputtedText = bufferedReader.readLine();
                System.out.println("Enter shift key");
                String shiftKey = bufferedReader.readLine();
                int encryptionKey = Integer.parseInt(shiftKey);
                CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedText, encryptionKey);
                String encrypted = createdCaesarCipher.cipherEncryption();
                System.out.println("ENCRYPTION:" + encrypted);
                System.out.println("-----------------");

                // Input for Decryption.
                System.out.println("Enter Encrypted Text");
                String encryptedText = bufferedReader.readLine();
                System.out.println("Enter shift key");
                String decryptShiftKey = bufferedReader.readLine();
                int decryptionKey = Integer.parseInt(decryptShiftKey);
                CaesarCipher createdCaesarCipher_2 = new CaesarCipher(encryptedText, decryptionKey);
                String decrypted = createdCaesarCipher_2.cipherDecryption();
                System.out.println("DECRYPTION:" + decrypted);
                System.out.println("------------------");
            } else if (choice.equals("2")) {
                System.out.println("..............");
                programmRunning = false;
            } else
                System.out.println("Invalid Choice");
        }
    }
}
