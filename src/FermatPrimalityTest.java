import java.util.Scanner;

public class FermatPrimalityTest {

    public void FermatPrimalityTest(){

    }
    public void fermatPrimality(int n, int k){
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input the value to test.");
        int n = myObj.nextInt();
        System.out.println("Please input the number of times to test.");
        int k = myObj.nextInt();
        FermatPrimalityTest test = new FermatPrimalityTest();
        test.fermatPrimality(n, k);
//        System.out.println("n: " + n);
//        System.out.println("k: " + k);
    }
}
