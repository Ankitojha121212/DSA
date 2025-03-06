package TCS;

import java.util.*;

public class DistanceBwTwoLines {
    public static void findDistance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double distance = Math.sqrt((x * x) + (y * y));
        System.out.println(distance);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cordinates of X1 and Y1 : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter the cordinates of X2 and Y2");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        findDistance(x1, y1, x2, y2);
    }

}
