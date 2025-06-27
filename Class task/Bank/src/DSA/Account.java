package DSA;

public class Account {

    private double balance;
    private String pin;
    private String accountNumber;
    private String name;

    public Account(String name, double balance, String pin, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        if (amount > 0) return this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) return this.balance -= amount;
        return this.balance;
    }

    public double transfer(double amount) {
        if (amount <= balance && amount > 0) return this.balance -= amount;
        return balance;
    }

    public void createAccount(String name, String pin, String accountNumber) {


    }
}
