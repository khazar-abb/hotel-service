package Generics.MyQuestion;

public class Main {
    static void main(String[] args) {

        Box boxConstructor = new Box("class with constructor");

        BoxGeneric<String> genStrBox = new BoxGeneric<>("generic class - 1111");
        BoxGeneric<Integer> genIntBox = new BoxGeneric<>(1111);
        BoxGeneric<Double> genDouBox = new BoxGeneric<>(99.999);

        boxConstructor.print("String");
        boxConstructor.print(99);

        System.out.println("-----------");

        genStrBox.print("generic");
        genDouBox.print(9.99);
    }
}