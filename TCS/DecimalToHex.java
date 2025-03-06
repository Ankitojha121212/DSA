package TCS;

import java.util.Scanner;

public class DecimalToHex {
    public static void ConvertToHex(int n) {
        String hex = "";

        while (n > 0) {
            int remainder = n % 16;
            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                hex = (char) ('A' + (remainder - 10)) + hex;
            }
            n = n / 16;
        }
        System.out.println(hex);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal : ");
        int n = scan.nextInt();
        ConvertToHex(n);

    }

}
