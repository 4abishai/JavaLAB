// Write a program in Java to define a class Rectangle having data members:
// length & breadth, and three methods called read(), calculate() and display() to
// read the values of length & breadth, calculate the area and perimeter of the
// rectangle and display the result respectively. Finally, create two objects of the
// Rectangle class, ask and input the respective dimensions (length,breadth) from
// the user, and then calculate and display their respective areas and perimeters.

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();

        float l1, l2, b1, b2;
        System.out.print("Enter length1 and breadth1: ");
        l1 = scan.nextFloat();
        b1 = scan.nextFloat();

        System.out.print("Enter length2 and breadth2: ");
        l2 = scan.nextFloat();
        b2 = scan.nextFloat();

        obj1.read(l1, b1);
        obj2.read(l2, b2);

        obj1.calculate();
        obj2.calculate();

        System.out.println("Area of first rectangle: ");
        obj1.display();

        System.out.println("Area of second rectangle: ");
        obj2.display();

        scan.close();

    }
}

class Rectangle {
    float length, breadth, area = 0, peri = 0;

    void read(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculate() {
        peri = 2 * (length + breadth);
        area = length * breadth;
    }

    void display() {
        System.out.println("Area is " + area + " perimeter is " + peri);
    }
}
