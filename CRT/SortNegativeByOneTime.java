public class SortNegativeByOneTime {
    public static void main(String[] args) {
        int arr[] = { -4, 3, -1, 5, 3, 7 };
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            j = i + 1;
            while (j < arr.length) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] > arr[j]) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
