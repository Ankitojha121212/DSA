package TCS;

import java.util.*;

public class Segregate0 {
    public static void seg(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                arr[j] = 0;
                arr[i] = 1;
                j++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1 };
        seg(arr);

    }

}
