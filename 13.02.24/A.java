// Illustrate the usage of abstract class with following Java classes:
// a. An abstract class ‘student’ with two data members roll no, reg no,
//    a method getinput() and an abstract method course()
// b. A subclass ‘kiitian’ with course() method implementation

import java.util.Scanner;

abstract class student {
    String rollNo;
    int regNo;

    void getinput(String rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class kiitian extends student {
    @Override
    void course() {
        char index4 = rollNo.charAt(3);
        switch (index4) {
            case '3':
                System.out.println("Course - B.Tech. (Mechanical Engg)");
                break;
            case '4':
                System.err.print("Course - B.Tech. (Information Technology)");
                break;
            case '5':
                System.out.println("Course - B.Tech. (Computer Science & Engg)");
                break;
            default:
                System.out.println("Course not found!");
                break;
        }
    }
}

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kiitian ki = new kiitian();

        System.out.print("Roll no - ");
        String rollNo = sc.nextLine();

        System.out.print("Registration no - ");
        int regNo = sc.nextInt();

        ki.getinput(rollNo, regNo);

        System.out.println("Roll no - " + rollNo);

        System.out.println("Registration no - " + regNo);

        ki.course();

        sc.close();
    }
}