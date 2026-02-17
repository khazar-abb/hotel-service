package Exceptions.BankAccount;

public abstract class BankAccount {
    private Integer accountNumber;
    private String ownerName;
    protected double balance;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public double getBalance() {
        return balance;
    }

    public BankAccount(Integer accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}