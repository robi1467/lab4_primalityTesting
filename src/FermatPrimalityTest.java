import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    Random rand = new Random();

    String fermatPrimality(BigInteger p, int s) {
        String res = "p is likely prime";
        if (p.equals(BigInteger.ONE))
            return "prime";

        for (int i = 0; i < s; i++) {
            BigInteger a =  getRandomFermatBase(p);
            a = a.modPow(p.subtract(BigInteger.ONE), p);
            if (!a.equals(BigInteger.ONE)) {
                res = "p is composite";
                return res;
            }
        }
        return res;
    }

    private BigInteger getRandomFermatBase(BigInteger n)
    {
        while (true)
        {
            final BigInteger a = new BigInteger (n.bitLength(), rand);
            // must have 1 <= a < n
            if (BigInteger.ONE.compareTo(a) <= 0 && a.compareTo(n) < 0)
            {
                return a;
            }
        }
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
        BigInteger temp = new BigInteger("12"); //<--- Change this to random big integer
        System.out.println(temp);
        FermatPrimalityTest test = new FermatPrimalityTest();
        System.out.println(test.fermatPrimality(temp, 5));
        for (int i = 1; i <= 50; i++){
            FermatPrimalityTest tst = new FermatPrimalityTest();
            BigInteger tmp = new BigInteger(String.valueOf(i));
            String result = tst.fermatPrimality(tmp,5);
            System.out.println(tmp);
            System.out.println(result);
        }
    }
}

