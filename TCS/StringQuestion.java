package TCS;

import java.util.Scanner;

public class StringQuestion {
    public static int findNumberOfWords(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count++;
            }
        }
        count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine();
        int count = findNumberOfWords(str);
        System.out.println(count);
    }

}
