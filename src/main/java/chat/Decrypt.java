package chat;

import javax.crypto.Cipher;
import java.security.PrivateKey;


class Decrypt {

    static String decrypt() throws Exception {

        String decrypted = Main.textToDecrypt;
        PrivateKey key = KeyToString.StringToKey();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedText = cipher.doFinal(decrypted.getBytes());
        return new String(decryptedText);
    }
}