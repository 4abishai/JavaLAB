package Marketing;

import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double basic) {
        return 0.05 * earnings(basic);
    }
}