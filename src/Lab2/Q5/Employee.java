package Lab2.Q5;

public class Employee implements Payable{
    private String employeeName;
    private String employeeId;
    private int noOfHours;
    private double ratePerHour;

    public Employee(String employeeName, String employeeId, int noOfHours, double ratePerHour) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.noOfHours = noOfHours;
        this.ratePerHour = ratePerHour;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", noOfHours=" + noOfHours +
                ", ratePerHour=" + ratePerHour +
                '}';
    }

    @Override
    public double getPayment() {
        System.out.println("Transferring to the employee bank account...");
        return ((double)noOfHours) * ratePerHour;
    }
}
