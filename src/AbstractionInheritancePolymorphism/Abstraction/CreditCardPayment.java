package AbstractionInheritancePolymorphism.Abstraction;

public class CreditCardPayment extends Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " AZN with credit card.");
    }
}
