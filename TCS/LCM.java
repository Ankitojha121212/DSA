package TCS;

import java.util.*;

public class LCM {
    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return GCD(a - b, b);
        } else {
            return GCD(a, b - a);
        }
    }

    public static void findLCM(int a, int b) {
        int gcd = GCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println(lcm);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = scan.nextInt();
        System.out.print("Enter b :");
        int b = scan.nextInt();
        findLCM(a, b);
    }
}