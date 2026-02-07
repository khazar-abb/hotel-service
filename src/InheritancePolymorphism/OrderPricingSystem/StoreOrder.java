package InheritancePolymorphism.OrderPricingSystem;

public class StoreOrder extends Order {
    double discount = 11.00;

    @Override
    public void calculateTotal(){
        double storePrice = basePrice - discount;
        System.out.println("Store price: " + storePrice);
    }
}
