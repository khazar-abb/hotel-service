package OopMaster;

public class PayPal extends Payment {

    public PayPal(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("PayPal payment - start from 10 $");
    }

    @Override
    public boolean validate() {
        return getAmount() > 10;
    }
}
