package OopMaster;

public class ApplePay extends Payment implements Notifiable {

    public ApplePay(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Apple Pay payment - start from 100 $");
    }

    @Override
    public boolean validate() {
        return getAmount() > 100;
    }

    @Override
    public void sendNotification(String message) {
        if (validate()) {
            System.out.println("ApplePay success message: " + message);
        } else {
            System.out.println("ApplePay fail message: " + message);
        }
    }
}
