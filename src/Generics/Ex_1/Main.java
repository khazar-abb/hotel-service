package Generics.Ex_1;

public class Main {
    public static void main(String[] args) {
        Box<Double> boxDouble = new Box<>(9.99);
        Box<Integer> boxInteger = new Box<>(100);
        Box<String> boxString = new Box<>("I'm generics and string.");
        boxDouble.printInfo();
        boxInteger.printInfo();
        boxString.printInfo();
    }
}