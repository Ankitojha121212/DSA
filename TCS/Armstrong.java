package TCS;

import java.util.*;

public class Armstrong {
    public static boolean arm(int n) {
        int num = n;
        int count = 0;
        double sum = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        n = num;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + Math.pow(ld, count);
            n = n / 10;
        }

        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong or not : ");
        int n = scan.nextInt();

        if (arm(n)) {
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Number is not an Armstrong Number.");
        }
    }

}
