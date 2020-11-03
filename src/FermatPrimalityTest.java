import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class FermatPrimalityTest {

    /**
     * fermatPrimality - calculates a prime candidate to see it he value is 
     * composite or if it is prime and will return the answer as a string.
     * 
     * @param p - BigInteger that is tested to be prime or composite
     * @param s - security parameter/iterator
     * @return - string that explains what the p value is
     */
    static String fermatPrimality(BigInteger p, int s) {
        // initial state for any p value
        String res = "p is likely prime";
        Random rand = new Random();
        BigInteger bi2 = new BigInteger("2");
        BigInteger maxlim = p.subtract(bi2); // max value that can be produced by a

        for (int i = 1; i < s; i++) {
        int bit = maxlim.bitLength();
        BigInteger a =  new BigInteger(bit, rand);

        // checks to make sure that the a value is within the constraints [2, p-2]
        if (a.compareTo(bi2) < 0)
            a = a.add(bi2);
        if (a.compareTo(maxlim.subtract(bi2)) >= 0)
            a = a.mod(maxlim.subtract(bi2)).add(bi2);

        BigInteger n = p.subtract(BigInteger.ONE);
        // System.out.println(a); // can use this to see the a values
        BigInteger eq = a.modPow(n, p);
            if (!eq.equals(BigInteger.ONE)) {
                res = "p is composite";
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {

/**
 * Use this section here. You can randomly generate a large 1024 bit bigInteger to check 
 * Other wise you can use a predetermined prime or composite number to better test the 
 * method. The bit size can be altered to 512 if that is desired.
 */
        Random rand = new Random();
        String largePrime = "158576883397346678633300286323182291078426888798978686986139521466526596098124564692077090201847424385373698008983369446786382416227539468845098836499335592230875873606079061336306577219584218966915294323855763191756291478723394819880618755717306106872871816635868919844406213535298043968915776115917530991663";
        // BigInteger temp = new BigInteger(1024, rand); // can alter the bit length here
        BigInteger temp = new BigInteger(largePrime);
        System.out.println(fermatPrimality(temp, 5)); 
    }
}

