package TCS;

import java.util.Scanner;

public class ReverseCoding {
    public static int find(int n) {
        if (n % 2 == 1) {
            return (n / 2) + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        int ans = find(n);
        System.out.println(ans);
    }

}
