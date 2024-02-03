
// Write a class Account containing acc_no, balance as data members and two
// methods as input() for taking input from user and disp() method to display the
// details. Create a subclass Person which has name and aadhar_no as extra data
// members and override disp() function. Write the complete program to take and
// print details of three persons.
import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();

        sc.close();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class D {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            persons[i] = new Person();

            persons[i].input();

            System.out.print("Enter name: ");
            persons[i].name = sc.nextLine();

            System.out.print("Enter Aadhar number: ");
            persons[i].aadhar_no = sc.nextLine();

            System.out.println();
        }

        System.out.println("\nDetails of all persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }

        sc.close();
    }
}
