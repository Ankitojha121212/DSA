package TCS;

// Print the digit with same order with space 
// 122345 is like 1 2 3 4 5
import java.util.Scanner;

public class PrintDigitWithSpace {
    public static void PrintDigit(int n) {
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        while (rev > 0) {
            int ld = rev % 10;
            System.out.print(ld + " ");
            rev = rev / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int n = scan.nextInt();
        PrintDigit(n);
    }

}
