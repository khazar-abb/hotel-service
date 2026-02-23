package Equals.Student_02;

import java.util.Objects;

public class Student {
    private int grade;
    private String name;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Student)){
            return false;
        }
        Student other = (Student) obj;
        return this.grade == other.grade
                && Objects.equals(this.name, other.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, name);
    }
}