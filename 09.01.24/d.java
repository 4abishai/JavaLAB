// Write a program in Java that first asks the user to input any number, followed by
// checking if the number entered by the user is a palindrome or not. If the number is
// a palindrome, then output the message “Palindrome successfully detected” or else
// “The input number is not a palindrome” on the console.

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();

        int numRev = 0;
        for (int i = num; i > 0; i /= 10) {
            int last = i % 10;
            numRev = numRev * 10;
            numRev = numRev + last;
        }

        if (numRev == num)
            System.out.println("Palindrome successfully detected");

        else
            System.out.println("The input number is not a palindrome");

        scan.close();
    }
}