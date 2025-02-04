package DSA.Recursion;
// for avoidance of interger overflow problem we can use the long datatype

import java.util.*;

public class power {
    public static int findPower(int a, int b) {
        int result = 1;
        if (b == 1) {
            return a;
        } else {
            return result = a * findPower(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scan.nextInt();
        System.out.print("Enter b : ");
        int b = scan.nextInt();

        System.out.println(findPower(a, b));
    }

}
