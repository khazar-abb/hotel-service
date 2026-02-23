package Equals.Student;

public class Main {
    static void main(String[] args) {
        Student student_01 = new Student(1, "khazar", Grade.D);
        Student student_02 = new Student(2, "khazar2", Grade.D);
        Student student_03 = new Student(2, "khazar3", Grade.D);

        System.out.println(student_01.equals(student_03));
        System.out.println(student_01.equals(student_02));
        System.out.println(student_02.equals(student_03));

    }
}
