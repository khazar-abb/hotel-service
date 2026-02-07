package AbstractionInheritancePolymorphism.Abstraction;

public class PayPalPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " AZN with PayPal.");
    }
}
