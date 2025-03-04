package TCS;

import java.util.Scanner;

// Print sum of digit like
// 45 is 9
//1234 is 10
public class sumOfDigits {
    public static void findSumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println("The sum of digit is : " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Digit to find the sum of it : ");
        int num = scan.nextInt();
        findSumOfDigit(num);
    }
}
