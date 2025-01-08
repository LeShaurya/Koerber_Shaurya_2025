package Lab2.Q4;

public class HourlyEmployee extends Employee{
    private double hourRate;
    private int noOfHours;

    public HourlyEmployee(String employeeName, int employeeId, double hourRate, int noOfHours) {
        super(employeeName, employeeId);
        this.hourRate = hourRate;
        this.noOfHours = noOfHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", HourlyEmployee{" +
                "hourRate=" + hourRate +
                ", noOfHours=" + noOfHours +
                "}}";
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Override
    public double payment() {
        return hourRate * noOfHours;
    }

    @Override
    public void increaseSalaryByPercentage(int percent) {
        hourRate += hourRate * ((double) percent / 100);
    }
}
