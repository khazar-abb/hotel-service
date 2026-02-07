package AbstractionInheritancePolymorphism.OrderPricingSystem;

public class Main {
    static void main() {
        Order orderOnline = new OnlineOrder();
        Order orderStore = new StoreOrder();

        orderOnline.calculateTotal();
        orderStore.calculateTotal();
    }
}
