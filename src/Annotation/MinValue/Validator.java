package Annotation.MinValue;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        String userName = "";
        try {
            Field nameField = obj.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            userName = (String) nameField.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.getMessage();
        }

        for(Field field : fields){

            if (field.isAnnotationPresent(MinValue.class)){
                MinValue minValue = field.getAnnotation(MinValue.class);
                int fieldMinValueLimit = minValue.minValue();

                field.setAccessible(true);
                try {
                    int fieldValue = field.getInt(obj);

                    if (fieldValue >= fieldMinValueLimit) {
                        System.out.println(field.getName() + " -> " + fieldValue);
                    } else {
                        throw new IllegalArgumentException(userName + "'s field " + field.getName() + " must be at least " + fieldMinValueLimit);
                    }
                } catch (IllegalAccessException | IllegalArgumentException e){
                    System.out.println("Error processing " + field.getName() + " of user " + userName + ": " + e.getMessage());
                }
            }
        }
    }
}
