// Define an interface Employee with a method getDetails() to get employee details
// as Empid and Ename. Also define a derived interface Manager with a method
// getDeptDetails() to get department details such as Deptid and Deptname.Then
// define a class Head which implements Manager interface and also prints all
// details of the employee. Write the complete program to display all details of
// one head of the department.

import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    @Override
    public void getDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }

    @Override
    public void getDeptDetails() {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public void setEmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void setDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Head head = new Head();

        System.out.print("Enter employee id - ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name - ");
        String empName = scanner.nextLine();

        System.out.print("Enter department id - ");
        int deptId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter department name - ");
        String deptName = scanner.nextLine();

        head.setEmployeeDetails(empId, empName);
        head.setDeptDetails(deptId, deptName);

        head.getDetails();
        head.getDeptDetails();

        scanner.close();
    }
}
