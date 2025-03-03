package TCS;

import java.util.Scanner;

public class Prime {
    public static int findPrime(int n) {
        int prime = 1;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                prime = 0;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find this is prime or not : ");
        int number = scan.nextInt();
        int result = findPrime(number);
        if (result == 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");// now find the square root of number

        }
    }

}
