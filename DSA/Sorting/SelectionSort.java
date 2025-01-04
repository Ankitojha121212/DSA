package DSA.Sorting;

import java.util.*;

public class SelectionSort {
    public int[] selectionSortt(int[] arr) {
        int n = arr.length;
        int minIndex = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);

        }
        return arr;
    }

    public void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 10, 90, 50, 60, 30, 20, 100 };
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSortt(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}