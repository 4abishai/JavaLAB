// Write a program in java using roll, name, and cgpa as data members to input
// the details of n students, followed by displaying their values. Next, display the
// name of the student having the lowest cgpa.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    public Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scan.nextInt();
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("CGPA: ");
            float cgpa = scan.nextFloat();

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Roll - " + students[i].roll +
                    ", Name - " + students[i].name + ", CGPA - " + students[i].cgpa);
        }

        float lowestCgpa = students[0].cgpa;
        String lowestCgpaStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaStudentName = students[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudentName);

        scan.close();
    }
}
