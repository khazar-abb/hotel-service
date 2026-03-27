package Collection.BankingQueue;

import Immutable.Printable;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServiceQueue {

    Queue<Customer> customerQueue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.toString() + " Added to queue.");
    }

    public void serveCustomer() {
        if (customerQueue.peek() != null) {
            System.out.println("Serving to: " + customerQueue.peek().toString());
            customerQueue.poll();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void showQueue() {
        System.out.println("Queue:");
        customerQueue.stream().forEach(System.out::println);
    }
}
