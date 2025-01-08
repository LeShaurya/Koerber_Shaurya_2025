package Lab2.Q3;

abstract class Account {
    private String name;
    private String accountNumber;
    private double accountBalance;

    public Account(String name, String accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("amount successfully added");
    }

    abstract void withdraw(double amount);
    abstract public double getBalance();
}
