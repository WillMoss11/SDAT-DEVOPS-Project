package BankingApp;

public class BankingAppMain {
    public static void main(String[] args) {
        // Create a new BankAccount instance with an initial balance of 1000
        BankAccount account = new BankAccount("123456", 1000);

        // Create an instance of TransactionService to handle deposits and withdrawals
        TransactionService transactionService = new TransactionService();
    }
}
