package az.payment.main;

import az.payment.service.PaymentService;

public class Main {
    static void main() {
        PaymentService paymentService = new PaymentService();

        paymentService.makePayments("Book purchase", 50.00);
        paymentService.makePayments("Course fee", 120.00);
        paymentService.makePayments("Subscription", 30.00);

        paymentService.listTransactions();

        System.out.println("Total amount: " + paymentService.calculateTotal());
    }
}