package AbstractionInheritancePolymorphism.Inheritance;

public class Truck extends Vehicle {

    private int weight;

    public Truck(String model, int maxSpeed, int capacity, int weight) {
        super(model, maxSpeed, capacity);
        this.weight = weight;
    }

    @Override
    public void displayInfo(){
        System.out.println(super.getModel() + " - " + super.getMaxSpeed() + " - " + super.getCapacity() + " - " + weight);
    }

}
