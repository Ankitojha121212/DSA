package DSA.Recursion;

import java.util.Scanner;

public class binarySearch {
    public static int BinarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BinarySearch(arr, low, mid - 1, target);
        } else {
            return BinarySearch(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 12, 54, 78, 98, 102, 104, 125, 122, 145, 155, 189, 789, 987, 999, 9856, 102458 };
        int high = arr.length;
        int low = 0;
        System.out.print("Enter the number to find from the array : ");
        int target = scan.nextInt();
        System.out.println(BinarySearch(arr, low, high - 1, target));
    }

}
