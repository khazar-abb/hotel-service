package Equals.Car;

import java.util.Objects;
import java.util.UUID;

public class Car {
    private String plateNumber;
    private String brand;
    private CarType carType;

    public String getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car(String plateNumber, String brand, CarType carType) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.carType = carType;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Car)){
            return false;
        }
        Car other = (Car) obj;
        return Objects.equals(this.plateNumber, other.plateNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(plateNumber);
    }
}