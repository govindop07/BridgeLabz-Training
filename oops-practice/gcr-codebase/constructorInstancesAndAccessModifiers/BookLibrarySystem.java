package com.constructorInstancesAndAccessModifiers;

//Problem 2: Book Library System
//Design a Book class with:
//ISBN (public).
//title (protected).
//author (private).
//Write methods to:
//Set and get the author name.
//Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

class Book {
    public String ISBN;
    protected String title;
    private String author;
    
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Getter and setter for private author
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author + "\n");
    }
}

class EBook extends Book {
    private String fileFormat;
    
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }
    
    public void displayEBook() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("Format: " + fileFormat);
        System.out.println("Author: " + getAuthor());
        System.out.println();
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "Govind", "PDF");
        ebook.displayEBook();
    }
}