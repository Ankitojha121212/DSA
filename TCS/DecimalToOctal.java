package TCS;

import java.util.Scanner;

public class DecimalToOctal {
    // with array

    // public static void DecimalToOctal(int n) {
    // int octal[] = new int[32];
    // int count = 0;
    // while (n > 0) {
    // octal[count] = n % 8;
    // count++;
    // n = n / 8;
    // }
    // for (int i = count - 1; i >= 0; i--) {
    // System.out.print(octal[i] + " ");
    // }
    // }

    // without arrray
    public static void DecimalToOctal(int n) {
        int octal = 0;
        int i = 1;
        for (int j = n; j > 0; j = j / 8) {
            octal = octal + (n % 8) * i;
            i = i * 10;
            n = n / 8;
        }
        System.out.println(octal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Decimal number to convert in Octal : ");
        int n = scan.nextInt();
        DecimalToOctal(n);
    }

}
