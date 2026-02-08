package AbstractionInheritancePolymorphism.AuthenticationStrategy;

public class AuthService {
    public void login(AuthMethod type){
        type.authenticate();
    }
}
