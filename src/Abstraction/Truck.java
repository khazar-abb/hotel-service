package Abstraction;

public class Truck extends VehicleBase {

    public Truck(double distance, double fuelConsumed) {
        super(distance, fuelConsumed);
    }

    @Override
    public void start(){
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Truck is stopping...");
    }

    @Override
    public double calculateFuelEfficiency(){
        return getDistance() / getFuelConsumed() - 2.0;
    }
}
