package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_04 {
    static void main(String[] args) {

        List<String> students = new ArrayList<>(List.of(
                "Ali",
                "Murad",
                "Nigar",
                "Aysel",
                "Rauf"
        ));

        students.sort(String::compareToIgnoreCase
        );
        System.out.println(students);
        System.out.println("------");

        List<String> reversed = students.reversed();
        System.out.println(reversed);
        System.out.println("-------");

        students.sort((name1, name2) -> name1.length() - name2.length());
        System.out.println(students);

        students.sort(Comparator.comparingInt(String::length));
        System.out.println(students);

    }
}
