package chat;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    static String encryptedText;
    private static String decryptedText;
    public static BigInteger publicKeyModulus;
    static String publicKeys1;
    static String textToDecrypt;
    static String privateKeyString;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        hello();

        switch (makeChoice()){
            case 1:
                System.out.println("Введите текст для шифровки");
                encryptedText = scanner.next();
                System.out.println("Введите публичный код");
                publicKeys1 = scanner.next();

//                System.out.println(Arrays.toString(Encrypt.EncryptText()));
                String arch = Base64.getEncoder().encodeToString(Encrypt.EncryptText());
                System.out.println("Take ur encrypt message");
                System.out.println(arch);


                break;
            case 2:
                System.out.println("Введите текст");
                textToDecrypt = scanner.next();
                System.out.println("Введите приватный код");
                privateKeyString = scanner.next();
                System.out.println(Decrypt.decrypt());
            case 3:
                //
                break;
            case 4:
                //
                break;
        }
    }
    private static int makeChoice() {
        return scanner.nextInt();
    }

    private static void hello() {
        System.out.println("              Crypto Chat          ");
        System.out.println(1 + " " + "crypt");
        System.out.println(2 + " " + "decrypt");
        System.out.println(3 + " " + "send to email");
        System.out.println(4 + " " + "exit");
    }
}