package Lambda;

import java.util.Arrays;
import java.util.List;


    public class Lambda_05 {
        public static void main(String[] args) {

            List<String> names = Arrays.asList("Ali", "Nigar", "Murad", "Aysel", "Orxan");
            names.stream()
                    .filter(n -> n.length() > 4)
                    .map(String::toUpperCase)
                    .forEach(System.out::println);

        }
    }