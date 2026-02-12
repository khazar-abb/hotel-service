package OopMaster;

public class Crypto extends Payment{

    public Crypto(double amount) {
        super(amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Crypto payment - start from 20 $");
    }

    @Override
    public boolean validate(){
        return getAmount() > 20;
    }
}
