package Annotation.Second;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(null, 20, null);

        try {
            SimpleValidator.validate(student);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
