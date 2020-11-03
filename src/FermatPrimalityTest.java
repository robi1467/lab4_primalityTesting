import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    static String fermatPrimality(BigInteger p, int s) {
        String res = "p is likely prime";
        Random rand = new Random();
        BigInteger bi2 = new BigInteger("2");
        BigInteger maxlim = p.subtract(bi2);

        for (int i = 1; i < s; i++) {
        int bit = maxlim.bitLength();
        BigInteger a =  new BigInteger(bit, rand);
        if (a.compareTo(bi2) < 0)
            a = a.add(bi2);
        if (a.compareTo(maxlim.subtract(bi2)) >= 0)
            a = a.mod(maxlim.subtract(bi2)).add(bi2);
        BigInteger n = p.subtract(BigInteger.ONE);
        System.out.println(a);
        BigInteger eq = a.modPow(n, p);
            if (!eq.equals(BigInteger.ONE)) {
                res = "p is composite";
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Scanner myObj = new Scanner(System.in);
        // System.out.println("Please input the value to test.");
        // int n = myObj.nextInt();
        // System.out.println("Please input the number of times to test.");
        // int k = myObj.nextInt();
        // fermatPrimality(n, k);
//        System.out.println("n: " + n);
//        System.out.println("k: " + k);
        Random rand = new Random();
        String largePrime = "6700417";
        BigInteger temp = new BigInteger(largePrime);
        System.out.println(fermatPrimality(temp, 5));
    }
}

