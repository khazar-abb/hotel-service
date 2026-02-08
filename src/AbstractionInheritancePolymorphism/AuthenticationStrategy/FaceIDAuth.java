package AbstractionInheritancePolymorphism.AuthenticationStrategy;

public class FaceIDAuth implements AuthMethod {
    @Override
    public void authenticate(){
        System.out.println("Face ID...");
    }
}
