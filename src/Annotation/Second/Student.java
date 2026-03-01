package Annotation.Second;

public class Student {

    @Required
    private String name;

    private int age;

    @Required
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
