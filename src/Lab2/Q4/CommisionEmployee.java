package Lab2.Q4;

public class CommisionEmployee extends Employee{
    private double commissionPercentage;
    private double totalSales;

    public CommisionEmployee(String employeeName, int employeeId, double commisionPercentage, double totalSales) {
        super(employeeName, employeeId);
        this.commissionPercentage = commisionPercentage;
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double payment() {
        return totalSales * commissionPercentage / 100;
    }

    @Override
    public void increaseSalaryByPercentage(int percent) {
        commissionPercentage += commissionPercentage * ((double) percent / 100);
    }
}
