package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "khazar", "baghirov");

        Class<?> studentClass = student.getClass();

    }

    public static boolean isGetter(Method method){
        if (method.getName().startsWith("get") && method.getParameterCount() == 0){
            System.out.println("This is getter method.");
            return true;
        }
        System.out.println("This is NOT getter method.");
        return false;
    }
}
