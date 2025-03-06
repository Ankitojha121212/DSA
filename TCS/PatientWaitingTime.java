package TCS;

import java.util.Scanner;

public class PatientWaitingTime {
    public static int waitingTime(int patients, int ari) {
        // int wait = 0;
        // int start = 0;
        // int end = 10;
        // int n = ari;
        // int diagnose = 10;
        // for (int i = 0; i < patients; i++) {
        // wait = end - n;
        // n = n + ari;
        // start = end;
        // end += diagnose;

        // }
        // return wait;

        return ((patients - 1) * (10 - ari));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many patients : ");
        int patients = scan.nextInt();
        System.out.print("Enter the patients arrival time average : ");
        int ari = scan.nextInt();

        int wait = waitingTime(patients, ari);
        System.out.println(wait);
    }

}
