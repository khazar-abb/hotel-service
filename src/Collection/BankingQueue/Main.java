package Collection.BankingQueue;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(11, "Rico");
        Customer c2 = new Customer(22, "Piqo");
        Customer c3 = new Customer(33, "Khazar");
        Customer c4 = new Customer(44, "Ronaldo");

        ServiceQueue customerService = new ServiceQueue();

        customerService.addCustomer(c1);
        customerService.addCustomer(c2);
        customerService.addCustomer(c3);
        customerService.addCustomer(c4);

        customerService.showQueue();

        customerService.serveCustomer();
        customerService.serveCustomer();

        customerService.showQueue();

    }
}
