package AbstractionInheritancePolymorphism.AuthenticationStrategy;

public class PasswordAuth implements AuthMethod{
    @Override
    public void authenticate(){
        System.out.println("Password...");
    }
}
