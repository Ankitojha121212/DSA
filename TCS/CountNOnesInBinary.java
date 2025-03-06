package TCS;

import java.util.Scanner;

public class CountNOnesInBinary {
    public static void count(int num) {
        int n = ConvertIntoBinary(num);
        int count = 0;
        while (n > 0) {
            int ld = n % 10;
            if (ld == 1) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

    public static int ConvertIntoBinary(int n) {
        int res = 0;
        int i = 1;
        while (n > 0) {
            int remainder = n % 2;
            res = res + (remainder) * i;
            i = i * 10;
            n = n / 2;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number to count the 1's in binary representation: ");
        int num = scan.nextInt();
        count(num);
    }

}
