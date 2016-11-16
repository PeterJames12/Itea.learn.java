package chat;

import java.io.*;
import java.util.Base64;
import java.security.*;

/**
 * author Igor
 */

public class Generate {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        String encodedPrivKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());

        String encodedPubKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        System.out.println("Public key: " + "\n" + encodedPubKey + "\n");
        System.out.println(publicKey);
        System.out.println("Private key: " + "\n" + encodedPrivKey);
        System.out.println(privateKey);
    }
}
