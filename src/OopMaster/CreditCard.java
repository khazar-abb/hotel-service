package OopMaster;

public class CreditCard extends Payment implements Notifiable{
    private int cardNumber;
    private int cvv;

    public CreditCard(double amount, int cardNumber, int cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(){
        System.out.println("Credit card payment - start from 50 $");
    }

    @Override
    public boolean validate(){
        return getAmount() > 50;
    }

    @Override
    public void sendNotification(String message){
        if (validate()) {
            System.out.println("Credit card success message: " + message);
        } else {
            System.out.println("Credit card fail message: " + message);
        }
    }

    public int getCardNumber(){
        return cardNumber % 1000;
    }
}
