package BankingApp;

public class BankingAppMain {
    public static void main(String[] args) {
        // Create a new BankAccount instance with an initial balance of 1000
        BankAccount account = new BankAccount("123456", 1000);

        // Create an instance of TransactionService to handle deposits and withdrawals
        TransactionService transactionService = new TransactionService();

        // Display the initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform a deposit of 500
        transactionService.processDeposit(account, 500);
        System.out.println("After deposit of $500: $" + account.getBalance());

        // Perform withdrawal of 200
        transactionService.processWithdrawal(account, 200);
        System.out.println("After withdrawal of $200: $" + account.getBalance());
    }
}
