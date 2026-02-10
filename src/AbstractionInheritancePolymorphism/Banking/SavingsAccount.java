package AbstractionInheritancePolymorphism.Banking;

public class SavingsAccount extends BankAccount {
    public int interestRate;

    public SavingsAccount(int accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += (balance * interestRate) / 100;
        System.out.println("Interest added, Balance: " + balance);
    }

    @Override
    public void displayInfo(){
        System.out.println(balance + " - " + interestRate);
    }

}
