package TCS;

import java.util.*;

public class Ocurrance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 567, 23, 789, 432, 91, 654, 123, 876, 345, 210,
                98, 543, 777, 654, 321, 100, 999, 876, 222, 456,
                890, 678, 234, 789, 543, 111, 876, 908, 345, 432,
                987, 765, 111, 543, 210, 654, 678, 876, 432, 345,
                222, 999, 123, 567, 789, 210, 432, 876, 543, 321 };

        System.out.println("Enter the number to find : ");
        int num = scan.nextInt();
        scan.close();

        int firstO = -1;
        int flag1 = 1;
        int secondO = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == num && flag1 == 1) {
                firstO = i;
                flag1 = 0;
            }
            if (arr[i] == num) {
                secondO = i;
            }
        }
        System.out.println("first Occurance is : " + firstO);
        System.out.println("Second occurance is : " + secondO);
    }

}
