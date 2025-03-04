package TCS;

import java.util.*;

// input is 5 5
/*
 * 
 *    11111
 *    10001
 *    10001 
 *    10001
 *    11111
 *
 * 
 * 
 */
public class PrintPattern {
    public static void printIt(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        printIt(rows, columns);

    }

}
