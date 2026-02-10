package Abstraction;

public abstract class VehicleBase implements Vehicle {
    private double distance;
    private double fuelConsumed;

    public VehicleBase(double distance, double fuelConsumed) {
        this.distance = distance;
        this.fuelConsumed = fuelConsumed;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }
}