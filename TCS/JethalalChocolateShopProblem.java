package TCS;

import java.util.Scanner;

public class JethalalChocolateShopProblem {
    public static int findShops(int i, int l) {
        double rem = Math.pow(2, l) - i;
        return (int) rem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ith shop: ");
        int i = scan.nextInt();
        System.out.print("Enter the 'L' means how many bits of shop are remaining : ");
        int l = scan.nextInt();
        int remainingShop = findShops(i, l);
        System.out.println("Remaining shops are : " + remainingShop);
    }

}
