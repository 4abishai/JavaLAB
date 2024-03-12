// Define two packages as – General and Marketing. In General package define a
// class ‘employee’ with data members as empid(protected), ename(private) and a
// public method as earnings() which calculates the total earnings as:
// earnings = basic + DA (80% of basic) + HRA (15% of basic)
// In the Marketing package, define a class ‘sales’ which extends from ‘employee’
// class and has a method “tallowance()” that calculates Travelling Allowance as
// 5% of total earning. Write a java program to find out total earnings of a sales
// person for the given basic salary amount and print along with the emp id.

import java.util.Scanner;

import Marketing.Sales;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int empid = scanner.nextInt();
        String ename = scanner.next();

        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        Sales salesPerson = new Sales(empid, ename);
        double totalEarnings = salesPerson.earnings(basic);
        double travelAllowance = salesPerson.tallowance(basic);

        System.out.println("The emp id of the employee is " + salesPerson.getEmpid());
        System.out.println("The total earning is " + (totalEarnings + travelAllowance));
    }
}
