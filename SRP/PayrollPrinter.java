package SRP;

public class PayrollPrinter {

    public void printPayrollDetails(Employee employee, double payroll) {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Payroll: " + payroll);
    }
}