package TCS;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void convertToDecimal(int n) {
        int count = 0;
        double deci = 0;
        while (n > 0) {
            int ld = n % 10;
            deci = deci + ld * (Math.pow(2, count));
            count++;
            n = n / 10;
        }
        System.out.println(deci);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Binary digit to Convert in Decimal : ");
        int n = scan.nextInt();
        convertToDecimal(n);
    }

}
