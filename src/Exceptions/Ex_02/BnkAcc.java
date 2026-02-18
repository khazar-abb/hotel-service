package Exceptions.Ex_02;

public class BnkAcc {
    private int accountId;
    private double balance;

    public BnkAcc(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new NegativeDepositException("-> Negative Deposit Exception.");
        } else {
            balance += amount;
            System.out.println(" + " + amount + ": New Balance = " + balance);
        }
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("-> Insufficient Fund Exception.");
        } else {
            balance -= amount;
            System.out.println(" - " + amount + ": New Balance = " + balance);
        }
    }

    public void transfer(double amount, BnkAcc destination){
        if (amount <= 0){
            throw new InvalidTransferAmountException("-> Invalid Transfer Amount Exception");
        }
        if (destination == this){
            throw new SameAccountTransferException("-> Same Account Transfer Exception");
        } else {
            balance -= amount;
            destination.deposit(amount);
            System.out.println(amount + " Tranfered to " + destination.getAccountId() + ". Your new balance: " + balance);
        }
    }

}