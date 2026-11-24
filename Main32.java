class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title) {
        this(bookId, title, "Unknown Author");
    }

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    Book() {
        this(0, "Unknown", "Unknown Author");
    }

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main32 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming");
        Book b2 = new Book(102, "Python Basics", "John");
        Book b3 = new Book();

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}