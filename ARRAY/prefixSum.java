package ARRAY;

import java.util.Scanner;

public class prefixSum {
    public static int sumRegion(int arr[][], int r1, int r2, int c1, int c2) {
        int up = 0, left = 0, repeated = 0, total = 0;
        total = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated = arr[r1 - 1][c1 - 1];
        int result = total - up - left + repeated;
        return result;
    }

    public static void preSum(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // traverse column wise to calculate the presum matrix
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int matSum(int arr[][], int r1, int r2, int c1, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println("Enter R1: ");
        int r1 = scan.nextInt();
        System.out.println("Enter R2: ");
        int r2 = scan.nextInt();
        System.out.println("Enter C1: ");
        int c1 = scan.nextInt();
        System.out.println("Enter C2: ");
        int c2 = scan.nextInt();

        matSum(arr, r1, r2, c1, c2);
        preSum(arr);
        int result = sumRegion(arr, r1, r2, c1, c2);
        System.out.println(result);

    }

}
