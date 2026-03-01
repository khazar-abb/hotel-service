package Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Generics.Wildcard.ListPrinter.printList;
import static Generics.Wildcard.ListPrinter.printListNumbers;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("first", "second", "third", "fourth");
        List<Integer> integerList = List.of(23, 13, 31, 331, 31);
        List<Double> doubleList = List.of(23.63, 13.53, 31.14, 331.00, 31.89);

        printList(stringList);
        printList(integerList);
        printList(doubleList);
        System.out.println("---------------------------------------------------");

        printListNumbers(integerList);
        printListNumbers(doubleList);
    }
}