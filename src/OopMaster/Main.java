package OopMaster;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Payment>payments = new ArrayList<>();
        payments.add(new CreditCard(60,12345678, 911));
        payments.add(new PayPal(15));
        payments.add(new Crypto(19));
        payments.add(new ApplePay(99));

        for (Payment bought : payments){
            System.out.println("---------------");
            if (bought.validate()){
                bought.processPayment();
            } else {
                System.out.println(bought.getAmount() + " $ is insufficient amount.");
            }
            if (bought instanceof Notifiable){
                ((Notifiable) bought).sendNotification("Operation executed now.");
            }
        }
    }
}