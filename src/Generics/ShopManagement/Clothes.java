package Generics.ShopManagement;

public class Clothes extends Product{
    private String size;

    public Clothes(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }
}
