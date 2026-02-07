package AbstractionInheritancePolymorphism.TransportSystem;

public class Train extends Transport {

    @Override
    public void move(){
        System.out.println("Train speed.");
    }

}
