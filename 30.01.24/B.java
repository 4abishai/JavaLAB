// Write a program to Illustrate the execution of constructors in multilevel
// inheritance with three Java classes – plate (length, width), box (length, width,
// height), woodbox (length, width, height, thick) where box inherits from plate
// and woodbox inherits from box class. Each class has a constructor where
// dimensions are taken from the user.

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length, width, height, thickness: ");
        float length = scan.nextFloat();
        float width = scan.nextFloat();
        float height = scan.nextFloat();
        float thick = scan.nextFloat();

        woodbox wb = new woodbox(length, width, height, thick);

        System.out.println("length (inherited): " + wb.length);
        System.out.println("width: (inherited): " + wb.width);
        System.out.println("height (inherited): " + wb.height);
        System.out.println("thick: " + wb.thick);

        scan.close();
    }
}

class plate {
    float length, width;

    plate(float length, float width) {
        this.length = length;
        this.width = width;
    }
}

class box extends plate {
    float height;

    box(float length, float width, float height) {
        super(length, width);
        this.height = height;
    }
}

class woodbox extends box {
    float thick;

    woodbox(float length, float width, float height, float thick) {
        super(length, width, height);
        this.thick = thick;
    }
}
