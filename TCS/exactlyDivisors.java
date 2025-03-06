package TCS;

import java.util.Scanner;

public class exactlyDivisors {
    public static void checkdivisor(int n) {
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (checkItsCount(j) == 9) {
                i++;
            }
        }
        System.out.println("divisors : " + i);
    }

    public static int checkItsCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        checkdivisor(num);
    }
}
