package az.hotel.main;

public class Main {
    static void main() {
        Product product = new Product(11, "miko", 100.00);
        Product product02 = new Product(22, "rimo", 200.00);
        Product product03 = new Product(33, "tuco", 300.00);

        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product02);
        cart.addProduct(product03);

        cart.printCart();
        System.out.println("Total price: " + cart.calculateTotalPrice());
    }
}