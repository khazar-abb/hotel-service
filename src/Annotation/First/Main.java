package Annotation.First;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("khazar", 1);
        GradeProcessor.printGradeInfo(student.getClass());
        System.out.println(student.toString());
    }
}
