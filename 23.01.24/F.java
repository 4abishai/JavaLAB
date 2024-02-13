// Write a program in java using constructor overloading concept to calculate the
// area of a rectangle having data members as length and breadth. Use default
// constructor to initialize the value of the data member to zero and parameterized
// constructor to initialize the value of data member according to the user input.

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle defaultRectangle = new Rectangle();
        System.out.print("Area of rectangle with default values: ");
        defaultRectangle.area();

        System.out.print("Enter length and breadth: ");
        float length = scan.nextFloat();
        float breadth = scan.nextFloat();

        Rectangle rec = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with user input values: ");
        rec.area();

        scan.close();

    }
}

class Rectangle {
    float length, breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(length * breadth);
    }
}
