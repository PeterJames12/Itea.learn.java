package chat;

import javax.crypto.*;
import java.security.*;


class Encrypt {

    private static String textEc = Main.encryptedText;

    static byte[] EncryptText() throws Exception {

        Cipher cipher = Cipher.getInstance("RSA");
        PublicKey key = KeyToString.StringPubKey();
        cipher.init(Cipher.ENCRYPT_MODE, key);

        return cipher.doFinal(textEc.getBytes());
    }
}