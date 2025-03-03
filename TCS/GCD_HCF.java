package TCS;

import java.util.Scanner;

// solving this question by eculidian theorem
public class GCD_HCF {
    public static int GCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        // Base Case
        if (a == b) {
            return a;
        }
        if (a > b) {
            return GCD(a - b, b);
        } else {
            return GCD(a, b - a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("GCD or HCF is : " + GCD(a, b));
    }

}
