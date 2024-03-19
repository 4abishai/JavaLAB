// Write a Java class which has a method called ProcessInput(). This method checks
// the number entered by the user. If the entered number is negative then throw an
// user defined exception called NegativeNumberException, otherwise it displays
// the double value of the entered number.

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class D {
    static void ProcessInput(int number) {
        try {
            if (number < 0) {
                throw new NegativeNumberException("Number should be positive");
            } else {
                System.out.println("Double value: " + (2 * number));
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ProcessInput(num);
    }
}
