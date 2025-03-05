package TCS;

import java.util.Scanner;

public class DecimalToBinary {
    public static void DtoB(int n) {
        if (n <= 0) {
            System.out.print("0");
            return;
        }
        int[] arr = new int[32];
        int count = 0;
        while (n > 0) {
            arr[count] = n % 2;
            count++;
            n = n / 2;
        }

        for (int j = count - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        DtoB(n);
    }

}
