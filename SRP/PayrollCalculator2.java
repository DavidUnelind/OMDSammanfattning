package SRP;

public class PayrollCalculator2 {

    public double calculatePayroll(Employee employee) {
        double payroll = employee.getSalary() * employee.getHoursWorked();
        return payroll;
    }
}