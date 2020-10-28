import java.util.Random;
import java.lang.Math;

import java.util.Scanner;

public class FermatPrimalityTest {

    static void fermatPrimality(int p, int s) {
        Random rand = new Random();
        for (int i = 1; i <= s; i++) {
            int a = rand.nextInt(p - 2) + 2;
            if (Math.pow(a, (p - 1)) % p != 1) {
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

