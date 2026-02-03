package az.payment.service;

public class PaymentService {
    final int MAX_LIMIT = 10;

    private String[] transactions = new String[MAX_LIMIT];
    private double[] amounts = new double[MAX_LIMIT];
    private int count;

    public void makePayments(String description, double amount) {
        if (count <= 10) {
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] == null && amounts[i] == 0) {
                    transactions[i] = description;
                    amounts[i] = amount;
                    count++;
                    break;
                }
            }
        } else {
            System.out.println("Cannot make payment. Reached a limit: " + MAX_LIMIT);
        }
    }

    public void listTransactions() {
        if (count == 0) {
            System.out.println("No transaction found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("TR (" + (i + 1) + ") - " + transactions[i] + " : " + amounts[i]);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += amounts[i];
        }
        return total;
    }
}