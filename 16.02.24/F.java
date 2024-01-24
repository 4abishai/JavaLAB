// Write a java program to find the number of objects created out of a class using
// the static modifier.

import java.util.Scanner;

public class F {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter desired no. of classes: ");
        int number = scan.nextInt();

        while (number-- > 0)
            new innerClass();

        System.out.println(innerClass.count + " number objects successfully created.");

        scan.close();
    }

    static class innerClass {
        static int count;

        // Constructor increases the count whenever an instance is created
        innerClass() {
            count++;
        }
    }
}
