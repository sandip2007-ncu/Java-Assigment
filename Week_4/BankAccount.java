public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance = balance + amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        return "Account Number: " + accountNumber + ", Owner Name: " + ownerName + ", Balance: " + balance;
    }
}
