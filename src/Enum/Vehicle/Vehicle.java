package Enum.Vehicle;

public enum Vehicle {
    CAR(FuelType.PETROL, false),
    TRUCK(FuelType.DIESEL, false),
    MOTORCYCLE(FuelType.ELECTRIC, true);

    private final FuelType fuelType;
    private final boolean isElectric;

    public FuelType getFuelType(){
        return fuelType;
    }

    public boolean isElectric(){
        return isElectric;
    }

    Vehicle(FuelType fuelType, boolean isElectric){
        this.fuelType = fuelType;
        this.isElectric = isElectric;
    }


}