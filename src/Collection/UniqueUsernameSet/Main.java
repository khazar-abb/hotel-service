package Collection.UniqueUsernameSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        register.registerUser("khazar");
        register.registerUser("rico");
        register.registerUser("mika");
        register.registerUser("khazar");
        register.registerUser("mars");
        register.registerUser("rico");
    }
}