// Write a java program that asks the user to enter the cell values of a 3 x 3
// matrix through the command line, followed by printing the sum of each
// diagonal (left & right) element separately.

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        System.out.print("Enter integers: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int data = scan.nextInt();
                matrix[i][j] = data;
            }
        }
        int RD = 0, LD = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--) {
            RD += matrix[i][j];
            LD += matrix[i][i];
        }

        System.out.println("Sum of Right Diagonal: " + RD);
        System.out.println("Sum of Left Diagonal: " + LD);

        scan.close();
    }
}
