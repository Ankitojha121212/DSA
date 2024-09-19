package ARRAY;

public class Reverse {
    public static void main(String[] args) {
        // Reverse an Array
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int f : arr) {
            System.out.print(f + " ");
        }

    }
}
