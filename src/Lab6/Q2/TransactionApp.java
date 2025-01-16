package Lab6.Q2;

public class TransactionApp {
    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account(1000);
        Thread t1 = new Thread(new Bank(acc));
        Thread t2 = new Thread(new Company(acc));
        System.out.println("The account balance is: " + acc.getBalance());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The account balance is: " + acc.getBalance());
    }
}
