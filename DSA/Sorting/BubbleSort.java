package DSA.Sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int pointer = 0;
            while (pointer < n - i - 1) {
                if (arr[pointer] > arr[pointer + 1]) {
                    int temp = arr[pointer];
                    arr[pointer] = arr[pointer + 1];
                    arr[pointer + 1] = temp;
                }
                pointer++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 30, 40, 60, 10, 50, 20 };
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arr);
    }
}
