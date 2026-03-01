package Generics.Wildcard;

import java.util.List;

public class ListPrinter {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + "  ");
        }
        System.out.println();
    }

    public static void printListNumbers(List<? extends Number> list) {
        for (Number obj : list) {
            System.out.print(obj + "  ");
        }
        System.out.println();
    }
}
