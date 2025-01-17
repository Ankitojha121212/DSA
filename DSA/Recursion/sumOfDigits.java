package DSA.Recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static int sumofdigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) + sumofdigits(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number and find their sum of digits: ");
        int number = scan.nextInt();
        System.out.println("The sum of digits of " + number + " is : " + sumofdigits(number));

    }

}
