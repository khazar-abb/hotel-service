package Annotation.MinValue;

public class User {
    private String name;
    @MinValue(minValue = 18)
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
