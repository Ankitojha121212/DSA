package TCS;

import java.util.*;

public class remainder {
    // public static int findRem(int n1, int n2) {
    // int res = n1 % n2;
    // return res;
    // }

    // with calculation
    // public static int findRem(int n1, int n2) {
    // int res = (n1 - n2 * (n1 / n2));
    // return res;
    // }

    // with loop
    public static int findRem(int n1, int n2) {
        int i = 1;
        int product = 1;
        while (product <= n1) {
            product = n2 * i;
            i++;
        }
        return (n2 - (product - n2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num 1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter the num 2 : ");
        int n2 = scan.nextInt();
        int rem = findRem(n1, n2);
        System.out.println("The remainder is : " + rem);

    }

}
