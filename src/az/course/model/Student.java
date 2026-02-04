package az.course.model;

public class Student {
    private int id;
    private String name;
    private Course[] courses = new Course[2];
//    private int studentCount;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void enrollCourse(Course course){
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                if (course.enroll()) {
                    courses[i] = course;
                    System.out.println(name + " enrolled successfully. - " + courses[i].getName());
                } else {
                    System.out.println("Course is full.");
                }
                return;
            }
        }
        System.out.println("Student cannot enroll in more than 2 courses.");

//        if (studentCount > 2) {
//            System.out.println(name + " already enrolled in 2 courses.");
//            return;
//        }
//        for (int i = 0; i < courses.length; i++){
//            if (courses[i] != null){
//                continue;
//            } else {
//                course.enroll();
//                courses[i] = course;
//                System.out.println("Student successfuly enrolled to " + course.getName() + " course");
//                studentCount++;
//                return;
//            }
//        }
    }

    public void printCourses(){
        System.out.println(name + "'s enrolled courses: ");
        for (int i = 0; i < courses.length; i++){
            if (courses[i] == null){
                System.out.println("Empty");
                continue;
            } else {
                System.out.println((i + 1) + ". " + courses[i].getName());
            }
        }
    }
}
