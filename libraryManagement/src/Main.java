import java.util.*;

class Book {
    int bookId;
    String bookName;
    String author;
    boolean isAvailable;

    Book(int id, String name, String auth) {
        bookId = id;
        bookName = name;
        author = auth;
        isAvailable = true;
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<Book>();
    }

    void addBook(int id, String name, String auth) {
        books.add(new Book(id, name, auth));
        System.out.println("Book added successfully");
    }

    void borrowBook(int id) {
        for (Book b : books) {
            if (b.bookId == id && b.isAvailable) {
                b.isAvailable = false;
                System.out.println("Book borrowed successfully");
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.bookId == id && !b.isAvailable) {
                b.isAvailable = true;
                System.out.println("Book returned successfully");
                return;
            }
        }
        System.out.println("Invalid book id");
    }

    void displayBooks() {
        System.out.println("Book Id\tBook Name\tAuthor\tAvailability");
        for (Book b : books) {
            System.out.println(b.bookId + "\t\t" + b.bookName + "\t\t" + b.author + "\t\t" + b.isAvailable);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(101, "Java", "James Gosling");
        library.addBook(102, "C++", "Bjarne Stroustrup");

        library.displayBooks();
        library.borrowBook(102);
        library.displayBooks();
        library.returnBook(102);
        library.displayBooks();
    }
}