// Write a java program that asks the user to enter the size of an array. Next,
// create an array of specific size input by the user, followed by asking the user
// to input the array’s contents through the command line. Finally, the program
// must sort the user-entered list of numbers and output the sorted array entries.

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sz = scan.nextInt();

        System.out.print("Enter integers: ");
        int arr[] = new int[sz];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        quick(arr, 0, sz - 1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }

    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void quick(int A[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(A, lb, ub);
            quick(A, lb, loc - 1);
            quick(A, loc + 1, ub);

        }
    }

    public static int partition(int A[], int lb, int ub) {
        int pivot = A[lb];
        int i = lb + 1;
        int j = ub;

        while (i <= j) {
            while (i <= ub && A[i] <= pivot)
                i++;

            while (j > lb && A[j] > pivot)
                j--;

            if (i < j)
                swap(A, i, j);
        }

        swap(A, lb, j);
        return j;
    }
}