package Exceptions.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount > balance) {
            }
            throw new InsufficientBalanceException("Insufficient Balance!");
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex);
        }
    }
}