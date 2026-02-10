package Abstraction;

public class Main {
    static void main() {
        VehicleBase car = new Car(100.0, 10.0);
        VehicleBase bike = new Bike(100.0, 10.0);
        VehicleBase truck = new Truck(100.0, 10.0);

        System.out.println(car.calculateFuelEfficiency());
        System.out.println(bike.calculateFuelEfficiency());
        System.out.println(truck.calculateFuelEfficiency());

        car.start();
        bike.start();
        truck.start();

        car.stop();
        bike.stop();
        truck.stop();
    }
}
