package Annotation.MinValue;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("mico", 21);
        User user2 = new User("mico", 14);
        User user3 = new User("mico", 35);

        Validator.validate(user1);
        Validator.validate(user2);
        Validator.validate(user3);
    }
}
