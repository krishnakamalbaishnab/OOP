import java.util.*;

class BankAccount {
    // Private attributes
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Public getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance (only allows positive deposits)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("John Doe", 5000);

        // Using getter to access private data
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Modifying balance using setter method
        account.deposit(1500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to withdraw an amount
        account.withdraw(2000);
        System.out.println("Balance after Withdrawal: " + account.getBalance());
    }
}
