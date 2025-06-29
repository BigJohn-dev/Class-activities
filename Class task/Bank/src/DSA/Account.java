package DSA;

public class Account {

    private double balance;
    private String password;
    private String accountNumber;
    private String name;

    public Account(String name, String password, String accountNumber, double balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double deposit(double amount) {
        if (amount > 0) return this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) return this.balance -= amount;
        return this.balance;
    }

    public String transfer(Account recipient, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            return "Transfer successful";
        }
        return "Transfer failed";
    }

    public Account createAccount(String name, String password, String accountNumber) {
        if (name == null || password == null || accountNumber == null) return null;
        else
            if (accountNumber.equals(this.getAccountNumber())) return null;
        return new Account(name, password, accountNumber, 0.0);
    }

    public Account loginToAccount(String accountNumber, String password) {
        if (accountNumber.equals(this.accountNumber) && password.equals(this.password)) {
            return new Account(name, password, accountNumber, 0.0);
        } else{
            if(accountNumber.equals(" ") || password.equals(" ")) return null;
        }
        return null;
    }
}