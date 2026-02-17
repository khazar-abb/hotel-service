package Exceptions.BankAccount;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {
        try {
            if (balance - amount < -500) {
                throw new InsufficientBalanceException("Overdrafts limit more than 500!");
            }
        } catch (InsufficientBalanceException ex) {
            balance -= balance;
        }
    }
}