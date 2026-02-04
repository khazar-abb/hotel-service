package az.library.main;

import az.library.model.Book;
import az.library.model.Reader;
import az.library.service.LibraryService;

public class Main {
    static void main() {
        LibraryService library = new LibraryService();

        Book b1 = new Book(01, "Figma", "Khazar", true);
        Book b2 = new Book(02, "Java", "Caspi", true);
        Book b3 = new Book(03, "Python", "Atlantic", true);
        Book b4 = new Book(04, "Kotlin", "Pacific", true);


        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.listAvailableBooks();

        Reader reader = new Reader("Crocop");
        reader.borrowBook(b1);
        reader.borrowBook(b2);
        reader.printBorrowedBooks();


    }
}
