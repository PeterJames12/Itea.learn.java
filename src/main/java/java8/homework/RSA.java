package java8.homework;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by james on 17.07.16.
 */
public class RSA {

    public static void main(String[] args) {

        int q = 11;
        int p = 17;
        int m = 12;
        int n = q * p;
        int f = (p - 1) * (q - 1);

        int e = findOverage(f);

        int d = findD(9, f);

        double powE = Math.pow(12, 9);
        System.out.println(powE);
        long E = (long) powE;
        System.out.println(E);
        System.out.println(Math.floorMod(E, n));

//        double powS = Math.pow(56, 89);
        BigDecimal bigDecimal = new BigDecimal(Math.pow(56, 89)-187_000_000);

        BigDecimal bigDecimal2;


        long result = 0;
        System.out.println(bigDecimal);

//        System.out.println(powS);
//        long S = (long) powS;
//        System.out.println(S);
//        long l = Math.floorMod(S, n);
//        System.out.println(l);

    }

    private static int findD(int e, int f) {
        double newE = e;
        double newF = f;

        int k = 3;
        int d = (f * k + 1) / e;

        return d;
    }

    static int gc(int a, int b) {

        return b == 0 ? a : gc(b, a % b);
    }

    private static int randomFromF(int f) {
        Random random = new Random();

        int e = 2 + random.nextInt(f - 1);
        return e;
    }

    private static int findOverage(int f) {

        int random = 0;
        int gc = 0;
        int res = 0;

        for (int j = 0; j < 50; j++) {
            random = randomFromF(f);
            gc = gc(random, f);
            if (gc == 1) {
                res = random;
            }
        }
        return res;
    }
}
