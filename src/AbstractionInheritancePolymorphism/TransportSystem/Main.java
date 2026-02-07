package AbstractionInheritancePolymorphism.TransportSystem;

public class Main {
    static void main() {
        Transport tr_01 = new Car();
        Transport tr_02 = new Train();
        Transport tr_03 = new Airplane();
        Transport tr = new Transport();

        System.out.println("BY USING UPCASTING");
        tr_01.move();
        tr_02.move();
        tr_03.move();
        tr.move();
        System.out.println();



        Car car = new Car();
        Train train = new Train();
        Airplane plane = new Airplane();

        System.out.println("ALSO CAN DO WITH SEPARATE OBJECTS");
        car.move();
        train.move();
        plane.move();
        System.out.println();
    }
}
