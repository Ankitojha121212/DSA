package DSA.Recursion;

import java.util.Scanner;

public class alternateSumSeries {
    public static int ASS(int number) {
        if (number == 0) {
            return 0;
        }
        if (number % 2 == 0) {
            return ASS(number - 1) - number;
        } else {
            return ASS(number - 1) + number;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();

        System.out.println("The sum is : " + ASS(number));

    }

}
