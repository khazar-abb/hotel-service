package Equals.Book;

public class Main {
    static void main(String[] args) {
        Book book = new Book("A1", "Ask the Dust", "John Fante");
        Book book_02 = new Book("A1", "Ask the Dust", "John Fante");
        Book book_03 = new Book("B99", "Ask the Dust", "John Fante");


        System.out.println(book.hashCode());
        System.out.println(book_02.hashCode());
        System.out.println(book_03.hashCode());

        System.out.println(book.equals(book_02));
        System.out.println(book_02.equals(book_03));
    }
}