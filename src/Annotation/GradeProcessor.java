package Annotation;

public class GradeProcessor {
    public static void printGradeInfo(Class<?> clazz) {

        if (clazz.isAnnotationPresent(GradeInfo.class)) {

            GradeInfo gradeInfo = clazz.getAnnotation(GradeInfo.class);

            System.out.println("Teacher: " + gradeInfo.teacher());
            System.out.println("Max Score: " + gradeInfo.maxScore());

        }

    }
}