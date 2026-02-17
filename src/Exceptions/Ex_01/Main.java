package Exceptions.Ex_01;

public class Main {
    public static void main(String[] args) throws InsufficientFundException {

        BankAccount_02 myAccount = new BankAccount_02(500);

        try {
            myAccount.deposit(-200);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAccount.deposit(1000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAccount.withdraw(1200);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

        myAccount.withdraw(1200);

        System.out.println("Current Balance: " + myAccount.getBalance());

    }
}