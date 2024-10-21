// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 21-10-2024
// Modified Date: 21-10-2024
// Description: Manages a collection of Book objects. It provides methods to add books, find a book by title (throwing an exception if not found), and display all books in the library.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Represents a Library that can hold a collection of Books.
 *
 * @param <T> the type of Book
 */
public class Library<T extends Book> {
    private List<T> books; // List to store books in the library

    /**
     * Constructs a new Library instance.
     */
    public Library() {
        this.books = new ArrayList<>(); // Initialize the list of books
    }

    /**
     * Adds a book to the library.
     *
     * @param book the book to be added
     */
    public void addBook(T book) {
        books.add(book); // Add the book to the list
    }

    /**
     * Finds a book based on the given predicate.
     *
     * @param condition the condition to match for finding a book
     * @return the found book
     * @throws BookNotFoundException if no book matches the condition
     */
    public T findBook(Predicate<T> condition) throws BookNotFoundException {
        for (T book : books) {
            // Check if the book matches the given condition
            if (condition.test(book)) {
                return book; // Return the found book
            }
        }
        // Throw exception if no book matches the condition
        throw new BookNotFoundException("Book not found.");
    }

    /**
     * Displays all books in the library.
     */
    public void displayBooks() {
        // Check if the library is empty
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        // Display the list of books
        System.out.println("Books in the library:");
        for (T book : books) {
            System.out.println(book); // Print each book
        }
    }
}
