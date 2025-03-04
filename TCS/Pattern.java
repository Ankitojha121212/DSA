package TCS;

import java.util.Scanner;

public class Pattern {
    public static void pat(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i + "*");
            }
            System.out.print(i);
            System.out.println();
        }
        // for down
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i + "*");
            }
            System.out.print(i);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value to print pattern :");
        int n = scan.nextInt();
        scan.close();
        pat(n);
    }
}
