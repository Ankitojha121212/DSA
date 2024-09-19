package ARRAY;

class Palindrome {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 33, 42, 1 };
        int n = arr.length;
        int p = 1;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                p = 0;
                System.out.println("The Array is not an palindromic Array");
                break;
            }
        }
        if (p == 1) {
            System.out.println("The Array is Palindrome");
        }
    }
}