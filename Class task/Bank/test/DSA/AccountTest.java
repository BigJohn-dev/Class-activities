package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account johnAccount;

    @BeforeEach
    public void startTestWith() {
        johnAccount = new Account("John",0.0, "1122", "0987654321");
    }

    @Test
    public void getBalance() {
        assertEquals(0.0, johnAccount.getBalance());
        assertEquals(5000.0, johnAccount .deposit(5000));
        assertEquals(5000.0, johnAccount.getBalance());
    }

    @Test
    public void depositMoneyTwice() {
        double depositMoney = johnAccount.deposit(5000);
        assertEquals(5000.0, depositMoney);

        double total = johnAccount.deposit(2000);
        assertEquals(7000.0, total);

    }

    @Test
    public void notToDepositNegativeAmount() {
        assertEquals(0.0, johnAccount.getBalance());
        double depositNegativeAmount = johnAccount.deposit(-3000);
        assertEquals(0.0, depositNegativeAmount);
    }

    @Test
    public void notToDepositZeroAmount() {
        assertEquals(0.0, johnAccount.getBalance());
        double depositZeroAmount = johnAccount.deposit(0);
        assertEquals(0.0, depositZeroAmount);
    }

    @Test
    public void withdrawMoney() {
        double depositMoney = johnAccount.deposit(5000);
        assertEquals(5000.0, depositMoney);
        double withdrawMoney = johnAccount.withdraw(3000);
        assertEquals(2000.0, withdrawMoney);
    }

    @Test
    public void notToWithdrawNegativeMoney() {
        double depositMoney = johnAccount.deposit(3000);
        assertEquals(3000.0, johnAccount.getBalance());
        double withdrawNegativeAmount = johnAccount.deposit(-2000);
        assertEquals(3000.0, withdrawNegativeAmount);
    }

    @Test
    public void notToWithdrawZeroAmount() {
        double depositZeroAmount = johnAccount.deposit(3000);
        assertEquals(3000.0, johnAccount.getBalance());
        double withdrawZeroAmount = johnAccount.withdraw(0);
        assertEquals(3000.0, withdrawZeroAmount);
    }

    @Test
    public void notToWithdrawAmountGreaterThanBalance(){
        double depositMoney = johnAccount.deposit(5000);
        assertEquals(5000.0, depositMoney);
        double withdrawMoney = johnAccount.withdraw(10_000);
        assertEquals(5000.0, withdrawMoney);
    }

    @Test
    public void transferMoney() {
        double depositMoney = johnAccount.deposit(5000);
        Account janeAccount = new Account("Jane", 0.0, "2211", "1234567890");

        String transferSuccess = johnAccount.transfer(janeAccount, 3000);

        assertEquals(2000.0, johnAccount.getBalance());
        assertEquals(3000.0, janeAccount.getBalance());
    }


    @Test
    public void notToTransferNegativeAmount(){
        double depositMoney = johnAccount.deposit(5000);
        Account janeAccount = new Account("Jane", 2000.0, "2211", "1234567890");

        String transferSuccess = johnAccount.transfer(janeAccount, -2000);

        assertEquals(5000.0, johnAccount.getBalance());
        assertEquals(2000.0, janeAccount.getBalance());
    }

    @Test
    public void notToTransferAmountGreaterThanBalance() {
        double depositMoney = johnAccount.deposit(5000);
        Account janeAccount = new Account("Jane", 0.0, "2211", "1234567890");

        String transferSuccess = johnAccount.transfer(janeAccount, 7000);

        assertEquals(5000.0, johnAccount.getBalance());
        assertEquals(0.0, janeAccount.getBalance());
    }

    @Test
    public void notToTransferZeroAmount() {
        double depositMoney = johnAccount.deposit(5000);
        Account janeAccount = new Account("Jane", 0.0, "2211", "1234567890");

        String transferSuccess = johnAccount.transfer(janeAccount, 0.0);

        assertEquals(5000.0, johnAccount.getBalance());
        assertEquals(0.0, janeAccount.getBalance());
    }

    @Test
    public void toCreateValidAccount() {
        Account janeAccount = new Account("Jane", 0.0, "2211", "1234567890");

        assertEquals("Jane", janeAccount.getName());
        assertEquals(0.0, janeAccount.getBalance());
        assertEquals("2211", janeAccount.getPassword());
        assertEquals("1234567890", janeAccount.getAccountNumber());
    }

    @Test
    public void shouldHandleNullOrEmptyName() {
        Account account = new Account(null, 0.0, "2211", "1234567890");
        assertNull(account.getName());
    }

    @Test
    public void shouldHandleNullOrEmptyPassword() {
        Account account = new Account("Jane", 0.0, null, "1234567890");
        assertNull(account.getPassword());
    }

    @Test
    public void shouldHandleNullOrEmptyAccountNumber() {
        Account account = new Account(null, 0.0, "2211", null);
        assertNull(account.getAccountNumber());
    }

    @Test
    public void cannotCreateAccountWithSameAccountNumber() {
        Account account = new Account(null, 0.0, "2211", "1234567890");
        Account account2 = new Account("Jane", 0.0, "2211", "1234567890");
        assertEquals(account.getAccountNumber(), account2.getAccountNumber());
    }


}
