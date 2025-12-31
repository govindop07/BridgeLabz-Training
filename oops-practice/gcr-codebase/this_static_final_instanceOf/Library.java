package com.bridgelabz.this_static_final_instanceOf;

//Sample Program 2: Library Management System
//Create a Book class to manage library books with the following features:
//Static:
//○       A static variable libraryName shared across all books.
//○       A static method displayLibraryName() to print the library name.
//This:
//○       Use this to initialize title, author, and isbn in the constructor.
//Final:
//○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
//Instanceof:
//○       Verify if an object is an instance of the Book class before displaying its details.

class Book {
	   // Static variable shared across all instances
	   private static String libraryName;
	   // Instance variables
	   private String title;
	   private String author;
	   private final String isbn; // Final variable to ensure immutability
	   
	   // Constructor to initialize instance variables
	   public Book(String title, String author, String isbn) {
	       this.title = title;
	       this.author = author;
	       this.isbn = isbn;
	   }
	   
	   // Static method to set the library name
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	   
	   // Static method to display the library name
	   public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	   
	   // Method to display book details
	   public void displayBookDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   
	   
	   // Getters for instance variables (optional, but recommended for encapsulation)
	   public String getTitle() {
	       return title;
	   }
	   public String getAuthor() {
	       return author;
	   }
	   public String getIsbn() {
	       return isbn;
	   }
	}


	public class Library {
		
	   public static void main(String[] args) {
		   
	       // Set the library name (static variable)
	       Book.setLibraryName("Egmore Library");
	       // Display the library name
	       Book.displayLibraryName();
	       // Create a new book instance
	       Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
	       // Display book details
	       book1.displayBookDetails();
	   }
	}
