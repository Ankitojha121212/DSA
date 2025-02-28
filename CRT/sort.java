
class Sort {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1 };

        int temp = 0;

        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } else if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}