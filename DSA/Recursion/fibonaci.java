package DSA.Recursion;

import java.util.Scanner;

public class fibonaci {
    public static int fibonacci(int n) {
        int result = 0;
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for finding the fibonacci number: ");
        int n = scan.nextInt();

        int result = fibonacci(n);
        System.out.println("The result of the fibonacci number on index " + n + " is : " + result);
    }

}
