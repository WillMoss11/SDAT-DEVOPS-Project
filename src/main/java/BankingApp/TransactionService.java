package BankingApp;

public class TransactionService {

    // The method to process a deposit
    public void processDeposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    // The method to process a withdrawal
    public void processWithdrawal(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}

