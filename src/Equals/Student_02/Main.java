package Equals.Student_02;

import java.util.HashSet;

public class Main   {

    static void main(String[] args) {
        Student st1 = new Student(90, "jdsd");
        Student st2 = new Student(90, null);

        HashSet<Student> students = new HashSet<>();
        students.add(st1);
        students.add(st2);


        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st2.equals(st1));
        System.out.println(students.size());
    }
}