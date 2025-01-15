package Lab6.Q2;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    //    default constructor
    public Account() {}

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void addAmount(double amount) {
        double temp = this.balance;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted.");
        }

        temp += amount;
        this.balance += temp;
        System.out.println("Deposited amount of: " + amount);
    }

    public synchronized void subtractAmount(double amount) {
        double temp = this.balance;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted.");
        }

        if(this.balance >= amount) {
            temp -= amount;
            this.balance -= temp;
            System.out.println("Withdrawn amount of: " + amount);
        } else {
            System.out.println("Not Sufficient Balance");
        }
    }
}
