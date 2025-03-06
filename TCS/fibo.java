package TCS;

import java.util.*;

public class fibo {
    // with Array
    // public static void fibonacci(int n) {
    // int[] fib = new int[n + 1];
    // fib[0] = 0;
    // fib[1] = 1;
    // for (int k = 2; k <= n; k++) {
    // fib[k] = fib[k - 1] + fib[k - 2];
    // }
    // System.out.println(fib[n]);
    // }

    // without Array
    // public static void fibonacci(int n) {
    // int a = 0;
    // int b = 1;
    // int c;
    // if (n <= 0) {
    // System.out.println("0");
    // return;
    // }
    // for (int i = 2; i <= n; i++) {
    // c = a + b;
    // a = b;
    // b = c;
    // }
    // System.out.println(b);
    // }

    // with recursion
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index number how much you wanted the fibonacci series: ");
        int n = scan.nextInt();
        System.out.println(fibonacci(n));

    }

}
