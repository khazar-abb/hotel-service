package Enum.Vehicle;

public class Main {
    public static void main(String[] args) {
        for (Vehicle vehicle : Vehicle.values()){
            System.out.println(vehicle + " -> " + vehicle.getFuelType() + " isElectric: " + vehicle.isElectric());
        }
        System.out.println(Vehicle.CAR);
    }

}