package Question_3;

import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;

    static int totalAccounts = 0;

    // Constructor
    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit (cash)
    void deposit(double amount) {
        balance += amount;
        System.out.println("Cash Deposited: " + amount);
    }

    // Deposit (online)
    void deposit(double amount, String mode) {
        balance += amount;
        System.out.println("Online Deposited via " + mode + ": " + amount);
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Display account details
    void display() {
        System.out.println("\n-Account Details-");
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}


public class Bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));

            System.out.print("Account No: ");
            int accNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            accounts.add(new Account(accNo, name, balance));
        }

        for (Account acc : accounts) {
            acc.deposit(1000);
            acc.deposit(500, "UPI");
            acc.withdraw(700);
            acc.display();
        }

        System.out.println("\nTotal Accounts: " + Account.totalAccounts);
    }
}