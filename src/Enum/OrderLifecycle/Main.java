package Enum.OrderLifecycle;

public class Main {
    static void main(String[] args) {

        OrderStatus.CREATED.printTransitionResult(OrderStatus.CONFIRMED);
        OrderStatus.CREATED.printTransitionResult(OrderStatus.SHIPPED);
        OrderStatus.SHIPPED.printTransitionResult(OrderStatus.DELIVERED);
        OrderStatus.DELIVERED.printTransitionResult(OrderStatus.CREATED);

    }
}