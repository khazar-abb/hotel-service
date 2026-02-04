package az.library.model;

import javax.xml.transform.Source;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void borrow(){
        if (available) {
            available = false;
        } else {
            System.out.println(title + " already borrowed.");
        }
    }

    public void printInfo() {
        System.out.println("ID: " + id +
                " | Title: " + title +
                " | Author: " + author +
                " | Available: " + available);
    }

    public String getTitle(){
        return title;
    }

    public boolean isAvailable(){
        return available;
    }

}
