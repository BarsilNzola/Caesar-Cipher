package models;

public class CaesarCipher {

    private String letter;
    private int shift;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String cipherCode = "";
    String decipherCode = "";

    public CaesarCipher(String letter, int shift) {
        this.letter = letter;
        this.shift = shift;
    }

    public String getLetter() {
        return this.letter;
    }

    public int getShift() {
        return this.shift;
    }

    public String cipherEncryption() {
        String text = letter.toLowerCase();

        for (int i = 0; i< text.length(); i++){
            int indexOfText = alphabet.indexOf(text.charAt(i));
            int indexOfEncryption = (indexOfText + shift) % 26;
            char encryptionLetter = alphabet.charAt(indexOfEncryption);
            cipherCode += encryptionLetter;
        }
        return cipherCode;
    }

    public String cipherDecryption() {
        String text = letter.toLowerCase();

        for (int i = 0; i < text.length(); i++){
            int indexOfCode = alphabet.indexOf(text.charAt(i));
            int indexOfDecryption = (indexOfCode - shift) % 26;
            if (indexOfDecryption < 0)
            {
                indexOfDecryption = alphabet.length() + indexOfDecryption;
            }
            char decryptedLetter= alphabet.charAt(indexOfDecryption);
            decipherCode += decryptedLetter;
        }
        return decipherCode;
    }
}
