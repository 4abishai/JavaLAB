import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        double operand2 = scanner.nextDouble();

        try {
            if (operand2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            double result = operand1 / operand2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
