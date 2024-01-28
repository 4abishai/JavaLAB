// Write a program in java to create a class called Box with three data members
// (length, width, height) and a method volume(). Also, implement the
// application class Demo, where an object of the box class is created with
// user-entered dimensions and prints the volume.

import java.util.Scanner;

class Box {
    float length, width, height;

    float volume(float length, float width, float height) {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Box box = new Box();
        System.out.print("Enter length, width, height: ");
        float length = scan.nextFloat();
        float width = scan.nextFloat();
        float height = scan.nextFloat();

        System.out.println(box.volume(length, width, height));

        scan.close();
    }
}
