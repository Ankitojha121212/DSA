package TCS;

import java.util.Scanner;

public class divisibility {
    public static boolean findDiv(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = (count + arr[i]) % 3;

        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array : ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();

        }

        if (findDiv(arr)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
