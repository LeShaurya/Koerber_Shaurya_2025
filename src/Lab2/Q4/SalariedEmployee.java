package Lab2.Q4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String employeeName, int employeeId, double weeklySalary) {
        super(employeeName, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double payment() {
        return weeklySalary;
    }

    @Override
    public void increaseSalaryByPercentage(int percent) {
        weeklySalary += weeklySalary * ((double) percent / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                "}}";
    }

}
