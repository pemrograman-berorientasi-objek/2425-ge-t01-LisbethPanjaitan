package fintech.model;

/**
 * @author 12S23041 - Lisbeth Panjaitan 
 * @author 12S23021 - Eunike Purba
 */
public class Account {
    private String owner;
    private String accountName;
    private double balance;

    // Constructor
    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0; // Initial balance is 0
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Override toString method to display account information
    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}

