package AbstractionInheritancePolymorphism.Inheritance;

public class Main {
    static void main() {
        Vehicle mazda = new Vehicle("CX-7", 240, 5);
        Vehicle volvo = new Vehicle("Terrex", 180, 7);

        Truck mac = new Truck("Large", 120, 200, 23910);
        Truck daf = new Truck("Medium", 160, 500,37171);

        mazda.displayInfo();
        volvo.displayInfo();

        mac.displayInfo();
        daf.displayInfo();
    }
}
