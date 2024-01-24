// Write a program in java to ask three different users to enter their:
// a. Name
// b. roll no
// c. section,
// d. and branch
// Followed by printing the details of each user in separate lines.

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Info[] arr = new Info[3];

        for (int i = 0; i < 3; i++) {
            String name, sec, branch;
            int roll;

            System.out.println("Enter name: ");
            name = scan.nextLine();

            System.out.println("Enter sec: ");
            sec = scan.nextLine();

            System.out.println("Enter branch: ");
            branch = scan.nextLine();

            System.out.println("Enter roll: ");
            roll = scan.nextInt();
            scan.nextLine();

            arr[i] = new Info(name, sec, branch, roll);
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.println("Name: " + arr[i].name);
            System.out.println("Section: " + arr[i].sec);
            System.out.println("Branch: " + arr[i].branch);
            System.out.println("Roll: " + arr[i].roll);
        }

        scan.close();
    }

    public static class Info {
        String name, sec, branch;
        int roll;

        Info(String name, String sec, String branch, int roll) {
            this.name = name;
            this.sec = sec;
            this.branch = branch;
            this.roll = roll;
        }
    }
}
