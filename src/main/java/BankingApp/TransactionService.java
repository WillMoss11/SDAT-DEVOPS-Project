package BankingApp;

public class TransactionService {

    // Method to process a deposit
    public void processDeposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    // Method to process a withdrawal
    public void processWithdrawal(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}

