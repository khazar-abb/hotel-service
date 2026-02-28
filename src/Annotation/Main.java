package Annotation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("khazar", 1);
        Class<?> myStudent = student.getClass();
        GradeProcessor.printGradeInfo(myStudent);
    }
}
