package TCS;

import java.util.Scanner;

public class AddFractionsReduced {
    public static void findReduced(int n1, int d1, int n2, int d2) {
        int x = n1 * d2 + n2 * d1;
        int y = LCM(d1, d2);
        int x1 = x / GCD(d1, d2);
        int y1 = y / GCD(d1, d2);
        System.out.println(x1 + " " + y1);
    }

    public static int LCM(int d1, int d2) {
        int lcm = (d1 * d2) / GCD(d1, d2);
        return lcm;
    }

    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return GCD(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numerator n1 : ");
        int n1 = scan.nextInt();

        System.out.print("Enter the denominator d1 : ");
        int d1 = scan.nextInt();

        System.out.print("Enter the numerator n2 : ");
        int n2 = scan.nextInt();

        System.out.print("Enter the denominator d2 : ");
        int d2 = scan.nextInt();

        findReduced(n1, d1, n2, d2);

    }

}
