package SRP;

public class PayrollCalculator1 {

    public void calculatePayrollAndPrintDetails(Employee employee) {
        double payroll = employee.getSalary() * employee.getHoursWorked();
        System.out.println("Employee: " + employee.getName());
        System.out.println("Payroll: " + payroll);
    }
}