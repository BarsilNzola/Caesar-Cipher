package models;

public class CaesarCipher {

    private char letter;

    public CaesarCipher(char letter, int shift) {
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }
}
