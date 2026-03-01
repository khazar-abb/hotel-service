package Generics.Advanced;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListPrinter printer = new ListPrinter();

        List<Integer> intList = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        List<Double> doubleList = new ArrayList<>(List.of(9.63, 60.53, 70.14, 80.00, 90.89));
        List<Number> numberList = new ArrayList<>(List.of(20, 30.53, 40, 50.00, 53, 60.32));

        System.out.println("Filtered Integers: " + printer.filterNumbers(intList));
        System.out.println("Filtered Doubles: " + printer.filterNumbers(doubleList));
        System.out.println("Filtered Numbers: " + printer.filterNumbers(numberList));

        printer.printSum(intList);
        printer.printSum(doubleList);
        printer.printSum(numberList);
    }
}