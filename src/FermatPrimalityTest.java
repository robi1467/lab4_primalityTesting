import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    static String fermatPrimality(BigInteger p, int s) {
        String res = "p is likely prime";
        Random rand = new Random();
        for (int i = 1; i < s; i++) {
        BigInteger a = new BigInteger("200");// incase the random number is larger than p
        BigInteger one = new BigInteger("1");
        BigInteger n = p.subtract(one);
        System.out.println(n +" "+ p);
        System.out.println(a.modPow(n, p));
            if (!a.modPow(n, p).equals(one)) {
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

