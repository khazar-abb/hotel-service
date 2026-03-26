package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        for (Student st : studentList){
            if (student.getId() == st.getId()){
                System.out.println("Student arleady exist in list.");
                return;
            }
        }
        studentList.add(student);
        System.out.println("Student added.");
    }

    public void removeStudent(int studentId){
            // write by using ITERATOR
        for (Student st : studentList){
            if (studentId == st.getId()){
                studentList.remove(st);
                System.out.println("Student removed. ID: " + st.getId());
                return;
            }
        }
        System.out.println("ID: " + studentId + " not exists in list.");
    }

    public Student findStudentById(int studentId){
        for (Student st : studentList){
            if (studentId == st.getId()){
                return st;
            }
        }
        return null;
    }

    public void printAllStudents(){
        for (Student st : studentList){
            System.out.println(st.toString());
        }
    }
}