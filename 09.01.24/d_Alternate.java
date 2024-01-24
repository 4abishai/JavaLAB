// Write a program in Java that first asks the user to input any number, followed by
// checking if the number entered by the user is a palindrome or not. If the number is
// a palindrome, then output the message “Palindrome successfully detected” or else
// “The input number is not a palindrome” on the console.

import java.util.Scanner;

public class d_Alternate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();

        String numString = String.valueOf(num); // Explicit typecasting

        int left = 0;
        int right = numString.length() - 1;

        int flag = 1;
        while (left < right && flag == 1) {
            if (numString.charAt(left) != numString.charAt(right))
            // In Java characters in a string are accessed using the charAt(index) method
            {
                flag = 0;
            }
            ++left;
            --right;
        }

        if (flag == 1)
            System.out.println("Palindrome successfully detected");
        else
            System.out.println("The input number is not a palindrome");

        scan.close();

    }
}