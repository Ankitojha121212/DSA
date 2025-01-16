package DSA.Sliding_Window;

import java.util.*;

public class Largest_subarray_of_sum_k {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 5, 2, 5, 8, 9, 4, 12, 5, 1, 0, 5, 3, 0, 5, 4, 0, 5 };
        int n = arr.length;

        int maxi = 0;
        int k = 5;
        int i = 0;

        int sum = 0;
        for (int j = 0; j < n; j++) {

            sum = sum + arr[j];

            while (sum > k) {
                sum = sum - arr[i];
                i++;
            }

            if (sum == k) {
                maxi = Math.max(maxi, j - i + 1);
            }
        }

        System.out.println(maxi);
    }

}
