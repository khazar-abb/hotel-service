package Annotation.Second;

import java.lang.reflect.Field;

public class SimpleValidator {

    public static void validate (Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Required.class)){
                if (field.get(obj) == null){
                    System.out.println("Field name is required!");
                } else {
                    System.out.println("Field: " + field.get(obj));
                }
            }

        }
    }
}