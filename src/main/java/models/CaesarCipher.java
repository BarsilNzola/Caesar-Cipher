package models;

public class CaesarCipher {

    private String letter;
    private int shift;

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
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String cipherCode = "";

        for (int i = 0; i< letter.length(); i++){
            int indexOfText = alphabet.indexOf(letter.charAt(i));
            int indexOfEncryption = (indexOfText + shift) % 26;
            char encryptionLetter = alphabet.charAt(indexOfEncryption);
            cipherCode += encryptionLetter;
        }
        return cipherCode;
    }
}
