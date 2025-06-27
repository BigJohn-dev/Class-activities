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
    public void withdrawMoney() {
        double depositMoney = johnAccount.deposit(5000);
        assertEquals(5000.0, depositMoney);
        double withdrawMoney = johnAccount.withdraw(3000);
        assertEquals(2000.0, withdrawMoney);
    }

    @Test
    public void notToWithdrawNegativeMoney() {
        assertEquals(0.0, johnAccount.getBalance());
        double withdrawNegativeAmount = johnAccount.deposit(-3000);
        assertEquals(0.0, withdrawNegativeAmount);
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
    assertEquals(5000.0, depositMoney);
    double transferMoney = johnAccount.transfer(3000);
    assertEquals(2000.0, transferMoney);
    }

    @Test
    public void notToTransferNegativeAmount(){
        double despositMoney = johnAccount.deposit(5000);
        assertEquals(5000.0, despositMoney);
        double transferNegativeMoney = johnAccount.transfer(-3000);
        assertEquals(5000.0, transferNegativeMoney);
    }

    @Test
    public void notToTransferAmountGreaterThanBalance() {
    double despositMoney = johnAccount.deposit(5000);
    assertEquals(5000.0, despositMoney);
    double transferMoney = johnAccount.transfer(10_000);
    assertEquals(5000.0, transferMoney);
    }

    @Test
    public void createAccountTest() {
        johnAccount.createAccount("John", "1122", "0987654321");
        assertEquals("John", johnAccount.createAccount());
        assertEquals("1122", johnAccount.createAccount());
        assertEquals("0987654321", johnAccount.createAccount());
        

    }
}
