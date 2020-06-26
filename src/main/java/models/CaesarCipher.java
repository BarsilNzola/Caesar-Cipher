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
}
