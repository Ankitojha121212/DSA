public class sortNegative {
    public static void main(String[] args) {
        int arr[] = { -4, -5, 9, 0, -3, 53, 34, 3 };
        int count1 = 0;
        int count2 = 0;

        int arr1[] = new int[arr.length];
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr1[count1] = arr[i];
                count1++;
            } else {
                arr2[count2] = arr[i];
                count2++;
            }
        }
        System.out.println("negative array: ");
        for (int i = 0; i < count1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Positive array: ");
        for (int i = 0; i < count2; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
