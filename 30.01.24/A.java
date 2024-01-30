// A plastic manufacturer sells plastic in different shapes like 2D sheet and
// 3D box. The cost of a sheet is Rs 40/- per square ft. and the cost of a box 
// is Rs 60/- per cubic ft. Implement it in Java to calculate the cost of 
// plastic as per the dimensions given by the user where 3D inherits from 2D.

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sheet2D sheet = new sheet2D();
        box3D box = new box3D();

        System.out.print("Enter height: ");
        sheet.length = box.length = scan.nextFloat();

        System.out.print("Enter breadth: ");
        sheet.breadth = box.breadth = scan.nextFloat();

        System.out.print("Enter height: ");
        box.height = scan.nextFloat();

        System.out.println("Cost of 2D sheet: " + sheet.getCost());
        System.out.print("Cost of 3D box: " + box.getCost());

        scan.close();

    }
}

class sheet2D {
    float length, breadth;
    static int cost = 40;

    float getArea() {
        return (length * breadth);
    }

    float getCost() {
        return (getArea() * cost);
    }
}

class box3D extends sheet2D {
    float height;
    static int cost = 60;

    @Override
    float getArea() {
        return (length * breadth * height);
    }

    float getCost() {
        return (this.getArea() * cost);
    }
}
