package Lab2.Q3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank;
        Account acc = null;
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("1 for savings account, 2 for current account");
        while (true) {
            int type = sc.nextInt();
            boolean pick = false;
            switch (type) {
                case 1:
                    acc = new SavingsAccount(name, "1234", 100);
                    bank = new Bank(acc);
                    pick = true;
                    break;
                case 2:
                    acc = new CurrentAccount(name, "1234", 100, "12345", 10);
                    bank = new Bank(acc);
                    pick = true;
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            if(pick)
                break;
        }
        acc.deposit(100);
        System.out.println("Current balance: " + acc.getAccountBalance());
        acc.withdraw(10);
        System.out.println(acc.getBalance());
    }
}
