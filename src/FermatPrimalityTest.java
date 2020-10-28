import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    static void fermatPrimality(BigInteger p, int s) {
        Random rand = new Random();
        BigInteger bi1 = new BigInteger("1");
        BigInteger bi2 = new BigInteger("2");
        for (int i = 1; i <= s; i++) {
            BigInteger a =  p.subtract(bi2);
            a = a.add(bi2);
            if (a.modPow(p.subtract(bi1), p) != bi1) {
                System.out.println("p is composite");
            }
        }
        System.out.println("p is likely prime");
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input the value to test.");
        int n = myObj.nextInt();
        System.out.println("Please input the number of times to test.");
        int k = myObj.nextInt();
        fermatPrimality(n, k);
//        System.out.println("n: " + n);
//        System.out.println("k: " + k);
    }
}

