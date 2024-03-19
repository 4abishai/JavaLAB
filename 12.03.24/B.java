
// Write a Java program to generate an ArrayIndexOutofBoundsException and
// handle it using a catch block.
// Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by space(array size 4):");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int arraySize = 4; // Suppose array size is 4

        try {
            int[] array = new int[arraySize];
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            System.out.println("Array elements: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out
                    .println(e);
        }

    }
}
