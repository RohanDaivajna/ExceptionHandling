// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 21-10-2024
// Modified Date: 21-10-2024
// Description: Represents a book with a title and an author. It includes methods to get the book's details and a string representation for display.

/**
 * Represents a Book with a title and an author.
 */
public class Book {
    private String title;  // Title of the book
    private String author; // Author of the book

    /**
     * Constructs a new Book with the specified title and author.
     *
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns a string representation of the Book.
     *
     * @return a string representing the book's details
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
