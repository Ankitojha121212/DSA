package TCS;

import java.util.Scanner;

public class PerfectSquare {
    public static int findPerfectSquare(int n) {
        double floatsquare = Math.sqrt(n);
        int squareRoot = (int) floatsquare;

        if (squareRoot * squareRoot == n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Integer Value to find that it is Perfect Square or not: ");
        int number = scan.nextInt();
        int result = findPerfectSquare(number);
        if (result == 1) {
            System.out.println(number + " is perfect Square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

}
