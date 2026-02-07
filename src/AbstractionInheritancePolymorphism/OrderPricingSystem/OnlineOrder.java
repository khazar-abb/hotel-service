package AbstractionInheritancePolymorphism.OrderPricingSystem;

public class OnlineOrder extends Order {

    double deliveryFee = 5.99;

    @Override
    public void calculateTotal(){
        double onlinePrice = basePrice + deliveryFee;
        System.out.println("Online order price: " + onlinePrice);
    }

}
