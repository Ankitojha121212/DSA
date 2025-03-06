package TCS;

import java.util.Scanner;

public class LeapYear {
    public static int findYear(int year) {
        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        // return 1;
        // } else {
        // return 0;
        // }

        if (year % 400 == 0) {
            return 1;
        } else if (year % 100 == 0) {
            return 0;
        } else if (year % 4 == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = scan.nextInt();
        scan.close();
        int res = findYear(year);
        if (res == 1) {
            System.out.println("Year is Leap Year");
        } else {
            System.out.println("Year is Not a Leap Year");
        }
    }

}
