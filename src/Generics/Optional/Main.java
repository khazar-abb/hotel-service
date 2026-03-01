package Generics.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>(List.of("Alice", "Bob", "Charlotte", "Eve"));
        List<String> names2 = new ArrayList<>(List.of("", "", "", ""));

        Optional<String> result1 = findMaxLengthName(names1);
        Optional<String> result2 = findMaxLengthName(names2);

        result1.ifPresentOrElse(
                name -> System.out.println("Name with max length: " + name),
                () -> System.out.println("No valid name found."));

        result2.ifPresentOrElse(
                name -> System.out.println("Name with max length: " + name),
                () -> System.out.println("No valid name found."));
    }

    public static Optional<String> findMaxLengthName(List<String> names) {
        return names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .max((name1, name2) -> Integer.compare(name1.length(), name2.length()));
    }
}
