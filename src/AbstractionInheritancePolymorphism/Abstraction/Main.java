package AbstractionInheritancePolymorphism.Abstraction;

public class Main {
    static void main() {
        Payment pay_01 = new CreditCardPayment();
        Payment pay_02 = new PayPalPayment();

        pay_01.pay(20.99);
        pay_02.pay(11.99);
    }
}
