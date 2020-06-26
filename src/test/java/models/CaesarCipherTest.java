package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void encryptedText() {
        CaesarCipher testEncryption = new CaesarCipher ( 'a', 1);
        assertEquals(true, testEncryption instanceof CaesarCipher);
    }
}