package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    static void main(String[] args) {

        List<String> students = new ArrayList<>(List.of(
                "Ali",
                "Murad",
                "Nigar",
                "Aysel",
                "Rauf"
        ));

        students.forEach(System.out::println); //method reference

        System.out.println("-----");

        for(String student : students){
            if (student.length() > 4){
                System.out.println(student);
            }
        }

        System.out.println("-----");

        for(String student : students){
            if (student.charAt(0) == 'A'){
                System.out.println(student);
            }
        }



    }
}
