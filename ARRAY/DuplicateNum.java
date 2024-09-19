package ARRAY;

public class DuplicateNum {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 30, 33, 33, 23, 22, 443, 33, 4, 3, 3, 3, 33, };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    System.out.println("The Duplicate Number is : " + arr[i]);
                }
            }
        }
    }
}
