package AbstractionInheritancePolymorphism.TrickyInterviewLevel;

public class CardPayment extends Payment{

    @Override
    void process(){
        System.out.println("Processing Card Payment...");
    }
}