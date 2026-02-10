package AbstractionInheritancePolymorphism.Banking;

public class Main {
    static void main() {
        BankAccount bankAccount = new BankAccount(11019, 60);
        SavingsAccount savingsAccount = new SavingsAccount(1212,200, 10);

        bankAccount.deposit(100.0);
        bankAccount.withdraw(20.0);
        bankAccount.displayInfo();

        savingsAccount.withdraw(50.0);
        savingsAccount.addInterest();
        savingsAccount.displayInfo();
    }
}
