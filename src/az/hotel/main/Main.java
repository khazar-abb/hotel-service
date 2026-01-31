package az.hotel.main;

import az.hotel.model.Guest;
import az.hotel.model.Room;
import az.hotel.service.HotelService;

public class Main {
    static void main() {
        Product product = new Product(11, "miko", 199.00);
        Product product02 = new Product(22, "akkakaka", 123.33);
        Product product03 = new Product(33, "dewewwe", 410.91);

        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product02);
        cart.addProduct(product03);

        cart.printCart();
    }
}