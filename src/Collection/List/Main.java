package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Student st1 = new Student(11, "mico", 99);
        Student st2 = new Student(22, "eric", 88);
        Student st3 = new Student(33, "robo", 77);
        Student st4 = new Student(44, "motto", 66);

        List<Student> list = new ArrayList<>();

        StudentManager manager = new StudentManager();
        manager.addStudent(st1);
        manager.addStudent(st2);
        manager.addStudent(st3);
        manager.addStudent(st4);
        System.out.println("--------------------------------------------");
        manager.removeStudent(11);
        manager.removeStudent(11);
        System.out.println("--------------------------------------------");
        System.out.println(manager.findStudentById(22));
        System.out.println(manager.findStudentById(11));
        System.out.println("--------------------------------------------");
        manager.printAllStudents();

    }
}
