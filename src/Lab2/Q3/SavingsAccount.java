package Lab2.Q3;

class SavingsAccount extends Account {

    private int interest;
    private double maximumWithdrawalAmount;

    public SavingsAccount(String name, String accountNumber, double accountBalance) {
        super(name, accountNumber, accountBalance);
        interest = 5;
        maximumWithdrawalAmount = super.getAccountBalance();
    }

    public SavingsAccount(String name, String accountNumber, double accountBalance, int interest,
                          double maximumWithdrawalAmount) {
        super(name, accountNumber, accountBalance);
        this.interest = interest;
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    @Override
    public double getBalance() {
        return getAccountBalance() + ((double) interest / 100) * getAccountBalance();
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= maximumWithdrawalAmount && (getAccountBalance() - amount) > 0) {
                setAccountBalance(getAccountBalance() - amount);
            System.out.println("Amount withdrawn");
                return;
        }
        System.out.println("Invalid operation");
    }

}
