package TCS;

import java.util.Scanner;

public class GreatestNumberInThree {
    public static int findLargest(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        return max;
    }

    public static int findSmallest(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < a) {
            min = c;
        }

        return min;
    }

    public static int findSecondLargest(int a, int b, int c) {
        int secondLarge;
        if (a >= b && a >= c) {
            if (b >= c) {
                secondLarge = b;
            } else {
                secondLarge = c;
            }
        } else if (b >= c && b >= a) {
            if (a > c) {
                secondLarge = a;
            } else {
                secondLarge = c;
            }
        } else {
            if (a >= b) {
                secondLarge = a;
            } else {
                secondLarge = b;
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three digits: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int largest = findLargest(a, b, c);
        System.out.println("Largest is : " + largest);

        int smallest = findSmallest(a, b, c);
        System.out.println("Smallest is : " + smallest);

        int secondLargest = findSecondLargest(a, b, c);
        System.out.println("Second largest is : " + secondLargest);

    }
}