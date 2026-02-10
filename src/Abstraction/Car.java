package Abstraction;

public class Car extends VehicleBase {

    public Car(double distance, double fuelConsumed){
        super(distance, fuelConsumed);
    }

    @Override
    public void start() {
        System.out.println("Car is staring...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public double calculateFuelEfficiency(){
        return getDistance() / getFuelConsumed() - 1.0;
    }
}