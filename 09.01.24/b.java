// Write a program in Java that asks as input the marks secured by him/her in
// chemistry out of 100. Next, using the marks entered by the user, generate the
// corresponding grade.

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        int marks;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks secured: ");
        marks = scan.nextInt();
        scan.nextLine();

        if (marks >= 90) {
            System.out.println("A - Excellent");
        } else if (marks >= 80) {
            System.out.println("B - Very Good");
        } else if (marks >= 70) {
            System.out.println("C - Very Good");
        } else if (marks >= 60) {
            System.out.println("D - Satisfactory");
        } else if (marks >= 50) {
            System.out.println("E - Work Hard");
        } else if (marks >= 40) {
            System.out.println("F - Just Passed");
        } else {
            System.out.println("Failed");
        }

        scan.close();
    }
}
