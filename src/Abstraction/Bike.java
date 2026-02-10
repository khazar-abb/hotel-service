package Abstraction;

public class Bike extends VehicleBase{

    public Bike(double distance, double fuelConsumed) {
        super(distance, fuelConsumed);
    }

    @Override
    public void start(){
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Bike is stopping...");
    }

    @Override
    public double calculateFuelEfficiency(){
        return getDistance() / getFuelConsumed() + 2.0;
    }
}
