package AbstractionInheritancePolymorphism.AuthenticationStrategy;

public class Main {
    static void main() {
        AuthMethod finger = new FingerPrintAuth();
        AuthMethod face = new FaceIDAuth();
        AuthMethod pass = new PasswordAuth();

        AuthService authService = new AuthService();

        authService.login(finger);
        authService.login(face);
        authService.login(pass);
    }
}
