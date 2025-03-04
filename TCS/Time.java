package TCS;

import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time in HH:MM:SS and AM or PM with them with no space.");
        String time = scan.nextLine();
        int arr[] = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        int second = Integer.parseInt(time.substring(6, 8));
        String timeStamp = time.substring(8, 10);
        if (timeStamp.equals("PM") || timeStamp.equals("pm")) {
            if (hour != 12) {
                hour += 12;
            }
        } else if (timeStamp.equals("AM") || timeStamp.equals("am")) {
            if (hour == 12) {
                hour = 00;
            }
        }

        System.out.println(hour + ":" + minute + ":" + second + " " + timeStamp);

    }

}
