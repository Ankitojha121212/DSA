package TCS;

import java.util.Scanner;

public class WorkingDays {
    // approach 1

    // public static double workTogether(int p1, int p2, int p3) {
    // // Work rate of each person
    // double rate1 = 1.0 / p1;
    // double rate2 = 1.0 / p2;
    // double rate3 = 1.0 / p3;

    // // Combined work rate
    // double totalRate = rate1 + rate2 + rate3;

    // // Total days required
    // return 1.0 / totalRate;
    // }

    // aproach 2
    public static double workTogether(int x, int y, int z) {
        return (x * y * z) / ((x * y) + (y * z) + (z * x));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first person work done days: ");
        int p1 = scan.nextInt();
        System.out.print("Enter second person work done days: ");
        int p2 = scan.nextInt();
        System.out.print("Enter third person work done days: ");
        int p3 = scan.nextInt();

        double totalDays = workTogether(p1, p2, p3);
        System.out.println("Total work will be completed in " + totalDays + " days.");

        scan.close();
    }
}
