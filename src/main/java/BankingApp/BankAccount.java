package BankingApp;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to get the balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        } else {
            throw new IllegalArgumentException("Insufficient funds.");
        }
    }

    // To grab the account number
    public String getAccountNumber() {
        return accountNumber;
    }
}


