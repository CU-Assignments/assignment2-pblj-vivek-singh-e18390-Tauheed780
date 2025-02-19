// Base class: Book
class Book {
    protected String title;
    protected String author;
    protected String isbn;

    // Constructor for Book
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details (Overridden in subclasses)
    public void displayDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Derived class: Fiction
class Fiction extends Book {
    private String genre;

    // Constructor for Fiction books
    public Fiction(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Fiction");
        System.out.println("Genre: " + genre);
    }
}

// Derived class: Non-Fiction
class NonFiction extends Book {
    private String subject;

    // Constructor for Non-Fiction books
    public NonFiction(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Non-Fiction");
        System.out.println("Subject: " + subject);
    }
}

// Main class to test the Library Management System
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating book objects
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", "1234567890", "Fantasy");
        NonFiction nonFictionBook = new NonFiction("A Brief History of Time", "Stephen Hawking", "0987654321", "Science");

        // Display book details
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
    }
}
