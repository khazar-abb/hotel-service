package Lambda;

import java.util.List;

public class Lambda_02 {
    static void main(String[] args) {
        List<Integer> numbers = List.of(
                5, 10, 15, 20, 25
        );

        numbers.forEach(System.out::println);
        System.out.println("-------");

        numbers.forEach(num -> {
            if(num % 2 == 0){
                System.out.println(num);
            }
        });
        System.out.println("-------");

        numbers.forEach(num -> System.out.println(num *2));

    }
}
