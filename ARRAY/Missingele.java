package ARRAY;

public class Missingele {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4 };
        int m = arr.length;
        int n = m + 1;// 1 is for missing number;
        int sumOfNatural = (n * (n + 1)) / 2;
        int sumofElement = 0;

        for (int i = 0; i < m; i++) {
            sumofElement += arr[i];
        }
        int missNumber = sumOfNatural - sumofElement;
        System.out.println("The Missing Number is : " + missNumber);

    }

}
