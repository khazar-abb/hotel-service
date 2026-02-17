package Exceptions.BankAccount;

public class Main {
    static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1, "Khazar", 1000);
        savingsAccount.withdraw(1200);

        CurrentAccount currentAccount = new CurrentAccount(2, "Mirco", 1000);
        currentAccount.withdraw(1300);
        currentAccount.withdraw(600);
    }
}
