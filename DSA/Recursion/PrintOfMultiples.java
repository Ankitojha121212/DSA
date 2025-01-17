package DSA.Recursion;

import java.util.*;

public class PrintOfMultiples {
    public static void print(int n, int k) {
        if (k == 0) {
            k = 1;
        } else {
            print(n, k - 1);
            System.out.println(n * k);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        System.out.print("Enter how many times you want it  : ");
        int k = scan.nextInt();

        print(n, k);
    }
}
