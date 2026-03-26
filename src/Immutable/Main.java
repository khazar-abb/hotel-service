package Immutable;

public class Main {
    static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }

    static void print(Printable printable){
        printable.print();
    }
}
