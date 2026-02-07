package AbstractionInheritancePolymorphism.Inheritance;

public class Vehicle {
    private String model;
    private int maxSpeed;
    private int capacity;

    public Vehicle(String model, int maxSpeed, int capacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public void displayInfo(){
        System.out.println(model + " - " + maxSpeed + " - " + capacity);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed<0){
            System.out.println();
        }
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
