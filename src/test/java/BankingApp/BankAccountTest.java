package BankingApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    // Test for depositing money into the account
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("123456", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance(), "Deposit should increase the balance by the deposit amount.");
    }

    // Test for withdrawing money from the account
    @Test
    public void testWithdrawal() {
        BankAccount account = new BankAccount("123456", 1000);
        account.withdraw(200);
        assertEquals(800, account.getBalance(), "Withdrawal should decrease the balance by the withdrawal amount.");
    }

    // Test for withdrawing too much resulting in insufficient funds
    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount("123456", 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
        assertEquals("Insufficient funds.", exception.getMessage(), "Should throw an exception if there are insufficient funds.");
    }
}

