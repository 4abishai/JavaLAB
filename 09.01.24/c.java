// Using switch..case statement in Java, write a program to print the corresponding
// weekday after asking the user first to enter a valid day number of the current
// month.

import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int weekday;
        System.out.println("Enter weekday: ");
        weekday = scan.nextInt();

        String dayName;

        switch (weekday) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("Cooresponding day: " + dayName);

        scan.close();
    }
}
