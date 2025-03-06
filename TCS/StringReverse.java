package TCS;

import java.util.*;

public class StringReverse {
    public static void rev(String str) {
        int n = str.length();
        char arr[] = str.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        rev(str);
    }
}