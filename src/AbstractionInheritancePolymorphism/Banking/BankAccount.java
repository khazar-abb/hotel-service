package AbstractionInheritancePolymorphism.Banking;

public class BankAccount {
    public int accountNumber;
    public double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit: " + amount + " Balance: " + balance);
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + -amount + " Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayInfo(){
        System.out.println(accountNumber + " - " + balance);
    }


}
