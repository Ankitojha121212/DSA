package TCS;

import java.util.Scanner;

public class PairOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array you want : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            int number = scan.nextInt();
            arr[i] = number;
        }
        System.out.println("Enter the target value which you have to find in an array: ");
        int target = scan.nextInt();
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Target found at i=" + i + " and j=" + j + " Index");
                    return;
                }
            }
        }

    }
}