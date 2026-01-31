package az.hotel.main;

public class Cart {
    private Product[] products = new Product[5];

    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++){
            if (products[i] == null){
                products[i] = product;
                break;
            }
        }
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (int i = 0; i < products.length; i++){
            total += products[i].getPrice();
        }
        return total;
    }

    public void printCart() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
                products[i].printInfo();
            } else {
                System.out.println("Empty");
            }
        }
    }
}