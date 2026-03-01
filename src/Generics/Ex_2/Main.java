package Generics.Ex_2;

public class Main {
    public static void main(String[] args) {

        Pair<Double, Boolean> doubleBooleanPair = new Pair<>();

        doubleBooleanPair.setValue_01(9.99);
        doubleBooleanPair.setValue_02(true);

        doubleBooleanPair.print();

    }
}