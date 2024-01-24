// Write a program in java to ask the user to enter three numbers.
// a. Next, write conditions to check whether the entered numbers are
// integers.
// i. If any of the input numbers are not integers, then the program
// should print “Enter valid integer inputs,”
// ii. Else the program needs to find out the largest among the three
// numbers and print the output: “The largest number among the
// input integers is: <the_number_returned_by_the_program>”

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integers: ");

        int x = 0, y = 0, z = 0;
        boolean flag = true;

        if (scan.hasNextInt()) {
            x = scan.nextInt();
        } else {
            System.out.println("Enter valid integer input");
            flag = false;
        }

        if (scan.hasNextInt()) {
            y = scan.nextInt();
        } else {
            if (flag) {
                System.out.println("Enter valid integer input");
                flag = false;
            }
        }

        if (scan.hasNextInt()) {
            z = scan.nextInt();
        } else {
            if (flag) {
                System.out.println("Enter valid integer input");
                flag = false;
            }
        }

        if (flag) {
            System.out.print("The largest number among the input integers is: " + largest(x, y, z));
        }

        scan.close();
    }

    public static int largest(int x, int y, int z) {
        return (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
    }
}
