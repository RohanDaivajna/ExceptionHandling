// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 21-10-2024
// Modified Date: 21-10-2024
// Description: A custom exception that is thrown when a user attempts to find a book that is not in the library.

public class BookNotFoundException extends Exception {
    /**
     * Constructs a new BookNotFoundException with the specified detail message.
     *
     * @param message the detail message
     */
    public BookNotFoundException(String message) {
        super(message);
    }
}
