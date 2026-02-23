package Equals.Car_02;

import java.util.Objects;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
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
        return this.year == other.year && Objects.equals(this.brand, other.brand);
    }

    @Override
    public int hashCode() {
        int result = 31 * year;
        if (brand != null){
            result = 31 * result + brand.hashCode();
        }
        return result;
    }

}
