package Equals.Car_02;

public class Main {
    static void main(String[] args) {
        Car c1 = new Car("BMW", 2022);
        Car c2 = new Car("BMW", 2022);
        Car c3 = new Car("BMW", 2023);

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        System.out.println(c1.equals(c3));



    }
}
