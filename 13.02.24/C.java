// Define an interface with three methods – earnings(), deductions() and 
// bonus() and define a Java class ‘Manager’ which uses this interface without
// implementing bonus() method. Also define another Java class ‘Substaff’ which
// extends from ‘Manager’ class and implements bonus() method. Write the complete
// program to find out earnings, deduction and bonus of a sbstaff with basic
// salary amount entered by the user

import java.util.Scanner;

interface Employee {
    int earnings(int basic);

    int deductions(int basic);

    int bonus(int basic);
}

// Since the Manager class does not implement the bonus() method, it is declared
// as abstract
abstract class Manager implements Employee {
    @Override
    public int earnings(int basic) {
        return (basic + ((basic * 80) / 100) + ((basic * 15) / 100));
    }

    @Override
    public int deductions(int basic) {
        return ((basic * 12) / 100);
    }
}

class Substaff extends Manager {
    @Override
    public int bonus(int basic) {
        return ((basic * 50) / 100);
    }
}

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basic salary - ");
        int basic = sc.nextInt();

        Substaff substaff = new Substaff();

        int earnings = substaff.earnings(basic);
        int deductions = substaff.deductions(basic);
        int bonus = substaff.bonus(basic);

        System.out.println("Earnings - " + earnings);
        System.out.println("Deductions - " + deductions);
        System.out.println("Bonus - " + bonus);

        sc.close();
    }
}
