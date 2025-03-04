package TCS;

import java.util.Scanner;

public class DecimalToBinary {
    public static void DtoB(int n) {
        int[] arr = new int[20];
        int count = 0;
        while (n > 0) {
            int res = n % 2;
            n = n / 2;
            arr[count] = res;
            count++;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        DtoB(n);
    }

}
