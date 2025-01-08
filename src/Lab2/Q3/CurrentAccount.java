package Lab2.Q3;

public class CurrentAccount extends Account {
    private String tradeLicenceNumber;
    private double overdraft;

    public CurrentAccount(String name, String accountNumber, double accountBalance, String tradeLicenceNumber,
                          double overdraft) {
        super(name, accountNumber, accountBalance);
        this.tradeLicenceNumber = tradeLicenceNumber;
        this.overdraft = overdraft;
    }

    public String getTradeLicenceNumber() {
        return tradeLicenceNumber;
    }

    public void setTradeLicenceNumber(String tradeLicenceNumber) {
        this.tradeLicenceNumber = tradeLicenceNumber;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public double getBalance() {
        return super.getAccountBalance();
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setAccountBalance(getBalance() - amount);
            return;
        }
        else if(amount <= (getBalance() + overdraft)) {
            setOverdraft(overdraft - amount);
            setAccountBalance(0);
            return;
        }
        System.out.println("Invalid operation");
    }
}
