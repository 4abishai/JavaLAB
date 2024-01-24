// Write a program in Java that asks the user to enter his/her first name and last
// name as input and then print both in one line in the following format: the last
// name followed by the first name.

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        System.out.println("Formatted Name: " + lastName + " " + firstName);
    }
}
