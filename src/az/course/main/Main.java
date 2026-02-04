package az.course.main;

import az.course.model.Course;
import az.course.model.Student;
import az.course.service.CourseService;

public class Main {
    static void main() {
        CourseService courseService = new CourseService();

        Course course01 = new Course(11, "Java", 5, 0);
        Course course02 = new Course(22, "Python", 8, 0);
        Course course03 = new Course(33, ".NET", 3, 0);

        courseService.addCourse(course01);
        courseService.addCourse(course02);
        courseService.addCourse(course03);

        Student student = new Student(15,"Khazar");
        student.enrollCourse(course01);
        student.enrollCourse(course02);
        student.enrollCourse(course03);

        student.printCourses();

        courseService.listCourses();
    }
}
