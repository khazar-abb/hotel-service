package AbstractionInheritancePolymorphism.Polymorphism;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Course>courses = new ArrayList<>();

        courses.add(new VideoCourse());
        courses.add(new LiveClass());
        courses.add(new InteractiveTest());

        for (Course course : courses){
            course.start();
        }
    }
}