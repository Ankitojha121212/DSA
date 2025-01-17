package DSA.Recursion;

import java.util.*;

public class factorial {
    public static int Factorial(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            result = n * Factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number for factorial : ");
        int n = scan.nextInt();

        int answer = Factorial(n);
        System.out.println("The factorial of " + n + " is : " + answer);
    }

}
