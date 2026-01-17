import java.util.*;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);
    }
}

class Main {
    public static void main(String[] args) {
        // Hardcoded input
        String accountNumber = "9662375274869";
        double balance = 8655;
        double addBalance = 5854;
        double withdrawBalance = 9437;

        // Create BankAccount object
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit and withdraw operations
        account.deposit(addBalance);
        account.withdraw(withdrawBalance);

        // Display final account details
        account.displayDetails();
    }
}
