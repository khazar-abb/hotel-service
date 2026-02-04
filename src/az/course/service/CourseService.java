package az.course.service;

import az.course.model.Course;

public class CourseService {
    private Course[] courses = new Course[10];
    static int totalCourses = 0;

    public void addCourse(Course course){
        courses[totalCourses++] = course;

//        for (int i = 0; i < totalCourses; i++){
//            if (courses[i] == null){
//                courses[i] = course;
//                totalCourses++;
//                System.out.println("New course added: " + courses[i].getName());
//                return;
//            }
//        }
    }

    public void listCourses(){
        System.out.println("List of Courses:");
//        if (courses == null){
//            System.out.println("No course created yet.");
//            return;
//        }
        for (int i = 0; i < totalCourses; i++){
            courses[i].printInfo();
        }
    }

}
