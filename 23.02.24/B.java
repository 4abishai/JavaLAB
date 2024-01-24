// Write a program to overload subtract method with various parameters in a
// class in Java. Write the driver class to use the different subtract methods using
// objects.

class Subtraction {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = result - numbers[i];
        }
        return result;
    }
}

public class B {
    public static void main(String[] args) {

        Subtraction subtractionObj = new Subtraction();

        int result1 = subtractionObj.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        double result2 = subtractionObj.subtract(15.5, 7.3);
        System.out.println("Result 2: " + result2);

        int[] numbers = { 8, 4, 2, 1 };
        int result3 = subtractionObj.subtract(numbers);
        System.out.println("Result 3: " + result3);
    }
}
