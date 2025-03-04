package TCS;

import java.util.Scanner;

// find the sum of all prime numbers in range
public class SumOfAllPrimeInRange {
    public static int findPrime(int n) {
        int flag = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        if (n == 1) {
            return 0;
        } else {
            return flag;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (findPrime(i) == 1) {
                count += i;
            }
        }
        System.out.println("The sum of all prime is : " + count);

    }
}