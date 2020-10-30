import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    static String fermatPrimality(BigInteger p, int s) {
        String res = "p is likely prime";
        Random rand = new Random();
        BigInteger bi1 = new BigInteger("1");
        BigInteger bi2 = new BigInteger("2");
        for (int i = 1; i < s; i++) {
            BigInteger a =  new BigInteger(1024, rand).subtract(bi2);
            a = a.add(bi2);
            if (!a.isProbablePrime(1)) {
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
        BigInteger temp = new BigInteger(1024, rand);
        fermatPrimality(temp, 5);
    }
}

