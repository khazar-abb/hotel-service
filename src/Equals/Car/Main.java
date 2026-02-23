package Equals.Car;

public class Main {
    static void main(String[] args) {
        Car car = new Car("11", "BMW", CarType.SEDAN);
        Car car_02 = new Car("11", "BMW", CarType.SEDAN);
        Car car_03 = new Car("222", "BMW", CarType.SEDAN);

        if (car.equals(car_02)){
            System.out.println("Bu maşın artıq mövcuddur.");
        } else {
            System.out.println("Yeni maşın əlavə oluna bilər.");
        }

        if (car_02.equals(car_03)){
            System.out.println("Bu maşın artıq mövcuddur.");
        } else {
            System.out.println("Yeni maşın əlavə oluna bilər.");
        }

        System.out.println(car.hashCode());
        System.out.println(car_02.hashCode());
        System.out.println(car_03.hashCode());
    }
}
