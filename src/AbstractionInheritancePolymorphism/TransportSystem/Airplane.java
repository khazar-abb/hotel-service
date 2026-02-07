package AbstractionInheritancePolymorphism.TransportSystem;

public class Airplane extends Transport {

    @Override
    public void move(){
        System.out.println("Airplane speed.");
    }

}
