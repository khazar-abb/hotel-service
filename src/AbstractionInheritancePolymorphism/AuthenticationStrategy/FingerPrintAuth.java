package AbstractionInheritancePolymorphism.AuthenticationStrategy;

public class FingerPrintAuth implements AuthMethod {
    @Override
    public void authenticate(){
        System.out.println("Finger Print...");
    }
}
