// Write a java program that will overload the area() method and display the
// area of a circle, triangle, and square as per user choice and user-entered
// dimensions.

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        getArea getA = new getArea();

        System.out.print("Enter 1 for circle, 2 for triangle, 3 for square: ");
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter radius (float): ");
                getA.Area(scan.nextFloat());
                break;
            case 2:
                System.out.print("Enter base (float) and height (float): ");
                getA.Area(scan.nextFloat(), scan.nextFloat());
                break;
            case 3:
                System.out.print("Enter side (int): ");
                getA.Area(scan.nextInt());
                break;

            default:
                System.out.print("INVALID CHOICE!");
                break;
        }

        scan.close();

    }
}

class getArea {
    void Area(float radius) {
        System.out.println("Area of the circle is: " + 3.14 * radius * radius);
    }

    void Area(float base, float height) {
        System.out.println("Area of the triangle is: " + (base * height) / 2);
    }

    void Area(int side) {
        System.out.println("Area of the square is: " + side * side);
    }
}