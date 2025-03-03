package TCS;

import java.util.Scanner;

// find Area of circle while Diameter is Given
// Area of circle = pi * Radius^2;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Diameter of Cicle : ");
        float Diameter = scan.nextFloat();
        float radius = Diameter / 2;
        float Area = (22f / 7) * radius * radius;
        System.out.printf("Area of Circle is : %.2f\n", Area);
        int x = 10;
        System.out.printf("%d", x);

    }
}
