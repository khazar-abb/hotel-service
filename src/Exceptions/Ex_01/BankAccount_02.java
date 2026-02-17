package Exceptions.Ex_01;

public class BankAccount_02 {
    private double balance;

    public BankAccount_02(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit Amount Can't Be Negative!");
        } else {
            balance += amount;
            System.out.println("Deposit successful: $" + amount);
        }
    }

    public void withdraw(double amount) throws InsufficientFundException{
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Amount in Fund!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
        }
    }
}
