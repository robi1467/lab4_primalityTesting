import java.util.Random;
import java.lang.Math;

public class FermatPrimalityTest {

public static void fermatPrimality(int p, int s) {
    Random rand = new Random();
    for (int i = 1; i <= s; i++) {
        int a = rand.nextInt(p-2) + 2;
        if (Math.pow(a, (p-1)) != 1) {
            System.out.println("p is composite");
        }
    }
    System.out.println("p is likely prime");
}






    public static void main(String[] args) {
    
    }
}

