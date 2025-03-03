package TCS;

import java.util.Scanner;

public class Factorial {
    public static int factoriall(int n) {
        int result = 1;
        if (n < 1) {
            return 0;
        }
        while (n != 1) {
            result *= n;
            n--;
        }
        return result;
    }

    public static int factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for factorial of that : ");
        int n = scan.nextInt();
        int result = factoriall(n);
        System.out.println(result);
        System.out.println("Using Recursion : " + factorialUsingRecursion(n));
    }

}
