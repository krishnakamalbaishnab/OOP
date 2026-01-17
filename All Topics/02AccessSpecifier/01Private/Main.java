import java.util.*;

class BankAccount {
    private double balance; // Private attribute

    // Getter to provide controlled access
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        // Creating an object
        BankAccount acnt = new BankAccount();

        acnt.deposit(300);

        // System.out.println(acnt.balance); // Throws an error
        System.out.println(acnt.getBalance());
    }
}
