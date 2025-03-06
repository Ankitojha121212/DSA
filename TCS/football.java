package TCS;

import java.util.*;

public class football {
    public static void match(int a, int b, int c) {
        int count1 = 0;
        int count2 = 0;

        while (c != 1) {
            if (a % c == 0) {
                count1++;
                a--;
            } else if (b % c == 0) {
                count2++;
                b--;
            } else {
                c--;
            }
        }
        System.out.println(count1 + " " + count2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 digits : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        match(a, b, c);
    }

}
