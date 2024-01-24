// Write a program in Java that asks the user to enter ten numbers from the
// command line and print both the count and corresponding numbers from each
// bracket (even and odd) among the input numbers. The program should handle
// the conditions where the user may input any non-integer input.

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int odd[] = new int[5];
        int even[] = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        int i = 0;
        while (i < arr.length) {
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
                i++;
            } else {
                System.out.println("INVALID INPUT!");
                scan.next(); // Consume invalid input
            }
        }
        scan.close();

        int j = 0, k = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[j++] = arr[i];
            } else {
                odd[k++] = arr[i];
            }
        }

        System.out.print("\nEven numbers (" + j + "): ");
        for (int x = 0; x < j; x++) {
            System.out.print(even[x] + " ");
        }

        System.out.print("\nOdd numbers (" + k + "): ");
        for (int x = 0; x < k; x++) {
            System.out.print(odd[x] + " ");
        }

    }
}
