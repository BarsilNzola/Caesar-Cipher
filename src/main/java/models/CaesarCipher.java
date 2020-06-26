package models;

public class CaesarCipher {

    private String letter;

    public CaesarCipher(String letter, int shift) {
        this.letter = letter;
    }

    public String getLetter() {
        return this.letter;
    }
}
