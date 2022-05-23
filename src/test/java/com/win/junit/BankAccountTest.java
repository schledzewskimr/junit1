package test.java.com.win.junit;
import main.java.com.win.junit.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTest {
    BankAccount testAccount = new BankAccount(500,"test",1);

    @DisplayName("Test deposit() method")
    @Test
    void testDeposit() {
        assertEquals(550, testAccount.deposit(50));
    }
    @DisplayName("Test withdraw() method")
    @Test
    void testWithdraw(){
        assertEquals(400,testAccount.withdraw(100));
    }
    @DisplayName("Test accountDetails() method")
    @Test
    void testAccountDetails(){
        assertEquals("account name: test\nmoney: 500.0\naccount number: 1", testAccount.accountDetails());
    }
    @DisplayName("Test transferSend() method")
    @Test
    void testTransferSend(){
        assertEquals(400,testAccount.transferSend(100));
    }
    @DisplayName("Test accountNumber() method")
    @Test
    void testAccountNumber(){
        assertEquals(1, testAccount.accountNumber());
    }
}
