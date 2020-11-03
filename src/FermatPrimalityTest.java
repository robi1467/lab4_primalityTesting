import java.util.Random;
import java.math.BigInteger;

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
                res = "p is composite with " + i + " attempts";
                return res;
            }
        }
        return res;
    }
    private static BigInteger multiplyStrings(String a, String b){
        BigInteger int1 = new BigInteger(a);
        BigInteger int2 = new BigInteger(b);
        return int1.multiply(int2);
    }
    public static void main(String[] args) {

/**
 * Use this section here. You can randomly generate a large 1024 bit bigInteger to check 
 * Other wise you can use a predetermined prime or composite number to better test the 
 * method. The bit size can be altered to 512 if that is desired.
 */
        Random rand = new Random();
        String largePrime1024 = "158576883397346678633300286323182291078426888798978686986139521466526596098124564692077090201847424385373698008983369446786382416227539468845098836499335592230875873606079061336306577219584218966915294323855763191756291478723394819880618755717306106872871816635868919844406213535298043968915776115917530991663";
        String largePrime512 = "158576883397346678633300286323182291078426888798978686986139521466526596098124564692077090201847424385373698008983369446786382416227539468845098836499335592230875873606079061336306577219584218966915294323855763191756291478723394819880618755717306106872871816635868919844406213535298043968915776115917530991663";
       
        String largeComposite512 = "4084427954536038385138725284668391430644469895936031251329406545393932344701473671913141118463224813377426908768089119024430570792100976689011422795356922";
        String largeComposite1024 = "175235910785053687508093669252142269082720923480713011429292757825307304464426816762427065109918367304282707375547941412176734738674236836691086836795978303608939792042380364175073923918927893734481284321383606714350205372635659595270854508069083928574489259566383158109737564144823601670408308285087237563154";

        String large256prime1 = "80533885455867006333299079001420574414722937163681702014302302961917981004859";
        String large256prime2 = "66153479897495903317517373067357710044089467777452529632685583857330363416311";

        String large512prime1 = "12296324043782649445502717876806444267127432453026870292891514436900595691868406808555492049547102130873990693288848138614660142350611639071234494966050301";
        String large512prime2 = "13072513054522902461007824784498106608343070339329857542234225729374526655420013098095904760733391601616661493336375413779434201970159299991292808478644657";
       
        // This is a random big integer tester
        BigInteger tempR = new BigInteger(1024, rand); // can alter the bit length here
        //System.out.println(fermatPrimality(tempR, 4));
        BigInteger carmicheal = new BigInteger("63973");
        //System.out.println(fermatPrimality(carmicheal, 20));
        System.out.println("512 of two prime numbers: " +fermatPrimality(multiplyStrings(large256prime1, large256prime2),20));
        System.out.println("1024 of two prime numbers: " +fermatPrimality(multiplyStrings(large512prime1, large512prime2),20));
        // BigInteger tempC512 = new BigInteger(largeComposite512);
        // System.out.println(fermatPrimality(tempC512, 10)); 
        // BigInteger tempC1024 = new BigInteger(largeComposite1024);
        // System.out.println(fermatPrimality(tempC1024, 10)); 

        // BigInteger temp512 = new BigInteger(largePrime512);
        // System.out.println(fermatPrimality(temp512, 10)); 
        // BigInteger temp1024 = new BigInteger(largePrime1024);
        // System.out.println(fermatPrimality(temp1024, 10)); 
    }
}


/**
 * Altering the s value does not change the amount of attempts that are made before 
 * declaring that a composite number is actual composite. This also applies to all
 * bit length values including 512 and 1024. When proofing whether a biginteger is 
 * composite, it does not need to take additional iterations to declare that it is true.
 * This is becasue of the fact that if it isnt equal to one through the modular equation
 * then its more than likely composite rather than prime.
 * With a Carmichael number(63973) it took more attempts to prove that the number was
 * composite with the most attempts out of twenty being 7mwith about 15 test being ran.
 * 
 */
