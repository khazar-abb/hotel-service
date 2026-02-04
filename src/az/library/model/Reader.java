package az.library.model;

public class Reader {
    private int id;
    private String name;
    private Book[] borrowedBooks = new Book[3];

    public Reader(String name) {
        this.name = name;
    }

    public void borrowBook(Book book){
        if (book.isAvailable()){
            for ( int i = 0; i < borrowedBooks.length; i++){
                if (borrowedBooks[i] == null){
                    book.borrow();
                    borrowedBooks[i] = book;
                    System.out.println(name + " borrowed " + book.getTitle());
                    break;
                }
            }
        }
    }

    public void printBorrowedBooks(){
        System.out.println(name + "'s borrowed books:");
        for (int i = 0; i < borrowedBooks.length; i++){
            if (borrowedBooks[i] != null){
                borrowedBooks[i].printInfo();          }
        }
    }

}
