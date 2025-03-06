package TCS;

import java.util.Scanner;

public class MergeSortedArray {
    public static void Merge(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int count = 0;
        int newArr[] = new int[n1 + n2 + 1];
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                newArr[count] = arr1[i];
                i++;
                count++;
            } else {
                newArr[count] = arr2[j];
                j++;
                count++;
            }
        }

        // if first array is remaining
        while (i < n1) {
            newArr[count] = arr1[i];
            i++;
            count++;
        }

        /// if second array is remaining
        while (j < n2) {
            newArr[count] = arr2[j];
            j++;
            count++;
        }

        // printing the new array
        for (int k = 0; k < count; k++) {
            System.out.print(newArr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 6, 54, 85, 78, 96, 96, 97, 890 };
        int arr2[] = { 0, 5, 5, 6, 78, 96, 97, 894, 897 };
        Merge(arr1, arr2);
    }

}
