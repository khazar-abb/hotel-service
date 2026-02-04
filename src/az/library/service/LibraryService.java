package az.library.service;
import az.library.model.Book;

public class LibraryService {
    private Book[] books = new Book[4];
    static int totalBooks = 0;

    public void addBook(Book book){
        if (totalBooks >= books.length){
            System.out.println("Library is full.");
        } else {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    totalBooks++;
                    break;
                }
            }
        }
    }

    public void listAvailableBooks(){
        if (books[0] == null){
            System.out.println("Empty library.");
        }
        for (int i = 0; i < books.length; i++){
            if (books[i] != null) {
                books[i].printInfo();
            }
        }
    }
}
