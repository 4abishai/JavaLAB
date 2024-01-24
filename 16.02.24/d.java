// Write a java program that asks the user to fill an integer array's size and its
// entries through the command line. Next, the program must find out the no. of
// occurrences of each element in the user-entered array, followed by printing
// each array entry along with the number of its occurrences in the array.

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sz = scan.nextInt();

        int arr[] = new int[sz];
        int temp[] = new int[sz];
        int count[] = new int[sz];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter integer: ");
            arr[i] = scan.nextInt();
        }

        BubbleSort(arr, sz);

        // Make an array of no duplicates
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[j] = arr[i];
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                // Checks the index boundary before accessing the array element at arr[i + 1]
                // to avoid an ArrayIndexOutOfBoundsException
                i++;
            }
            j++;
        }

        // Store count on count array
        for (int i = 0; i < temp.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (temp[i] == arr[k]) {
                    count[i]++;
                }
            }
        }

        System.out.println("Element Occurrences:");
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i] + ": " + count[i] + " times");
        }

        scan.close();
    }

    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void BubbleSort(int A[], int n) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1])
                    swap(A, j, j + 1);
            }
        }
    }
}