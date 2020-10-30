import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    static void fermatPrimality(BigInteger p, int s) {
        // String res = "p is likely prime";
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
            BigInteger eq = a.modPow((p.subtract(BigInteger.ONE)), p);
            if (!eq.equals(BigInteger.ONE)) {
                // res = "p is composite";
                System.out.println("p is composite");
            }
        }
        System.out.println("p is likely prime");
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
        // BigInteger temp = new BigInteger(1024, rand);
        BigInteger temp = new BigInteger("11");
        fermatPrimality(temp, 20);
    }
}

