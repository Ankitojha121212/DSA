package TCS;

import java.util.Scanner;

public class AllPrime {
    public static boolean findPrime(int number) {
        boolean flag = true;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i++) {
            if (findPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
