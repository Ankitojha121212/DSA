package TCS;

import java.util.Scanner;

// we have given 10-11-2006 now we have to find the total number of days in this month
public class FindNumberOfDays {
    public static void main(String[] args) {
        int monthArray[] = { 30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year in 'DD-MM-YYYY' :- ");
        String str = scan.nextLine();
        // String str = "22-11-2004";
        int month = Integer.parseInt(str.substring(3, 5));

        System.out.println("The total number of days in :" + str + " is : " + monthArray[month - 1]);
    }

}
