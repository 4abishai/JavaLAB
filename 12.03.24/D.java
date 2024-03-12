import java.util.Scanner;

public class D {
    public static void ProcessInput(int number) {
        try {
            if (number < 0) {
                throw new NegativeNumberException("Number should be positive");
            } else {
                System.out.println("Double value: " + (2 * number));
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ProcessInput(num);
    }
}
