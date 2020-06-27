package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testEncryption = new CaesarCipher("a", 1);
        assertEquals(true, testEncryption instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_getsLetter_a() {
        CaesarCipher testEncryption = new CaesarCipher("a", 1);
        assertEquals("a", testEncryption.getLetter());
    }

    @Test
    public void newCaesarCipher_getsShift() {
        CaesarCipher testEncryption = new CaesarCipher("a", 1);
        assertEquals(1, testEncryption.getShift());
    }

    @Test
    public void newCaesarCipher_cipherEncryption() {
        CaesarCipher testEncryption = new CaesarCipher("a", 1);
        assertEquals("b", testEncryption.cipherEncryption());
    }

    @Test
    public void newCaesarCipher_cipherDecryption() {
        CaesarCipher testEncryption = new CaesarCipher("b", 1);
        assertEquals("a", testEncryption.cipherDecryption());
    }

    @Test
    public void newCaesarCipher_testWithWord() {
        CaesarCipher testEncryption = new CaesarCipher("barsil", 1);
        assertEquals("cbstjm", testEncryption.cipherEncryption());
    }

    @Test
    public void newCaesarCipher_decryptionTestWithWord() {
        CaesarCipher testEncryption = new CaesarCipher("cbstjm", 1);
        assertEquals("barsil", testEncryption.cipherDecryption());
    }

    @Test
    public void newCaesarCipher_testWithWord_shift_3() {
        CaesarCipher testEncryption = new CaesarCipher("barsil", 3);
        assertEquals("eduvlo", testEncryption.cipherEncryption());
    }
}