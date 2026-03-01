package Generics.Bounding;

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> numberBoxInteger = new NumberBox<>(51);
        NumberBox<Double> numberBoxDouble = new NumberBox<>(51.59d);
        NumberBox<Float> numberBoxFloat = new NumberBox<>(73.22f);

        numberBoxInteger.print();
        numberBoxDouble.print();
        numberBoxFloat.print();

        System.out.println("------------------------");

        System.out.println("add Integer - " + numberBoxInteger.sum(10));
        System.out.println("add Double - " + numberBoxDouble.sum(10.0d));
        System.out.println("add Integer - " + numberBoxFloat.sum(10.0f));

    }
}