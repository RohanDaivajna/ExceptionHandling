// Author: Rohan Daivajna 
// Roll number: 35
// Title: Goa Legislative Assembly Assignment 5
// Start Date: 21-10-2024
// Modified Date: 21-10-2024
// Description: The main class that contains the main method. It provides a menu-driven interface for users to interact with the library system. Users can add books, search for a book by title, display all books, or exit the program.

import java.util.Scanner;

/**
 * Main class to run the Library Management System.
 */
public class LibraryManagement {
    public static void main(String[] args) {
        // Create a Library instance to manage Book objects
        Library<Book> library = new Library<>();
        // Scanner to read user input from the console
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu loop to allow user interaction
        do {
            // Display the menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Find a Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine(); // Consume newline character

            // Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    // Add a book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine(); // Get the book title
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine(); // Get the book author
                    library.addBook(new Book(title, author)); // Add the book to the library
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Find a book
                    System.out.print("Enter the title of the book to find: ");
                    String searchTitle = scanner.nextLine(); // Get the title to search

                    try {
                        // Use a lambda expression to find the book by title
                        Book foundBook = library.findBook(book -> book.getTitle().equalsIgnoreCase(searchTitle));
                        System.out.println("Found: " + foundBook); // Display found book
                    } catch (BookNotFoundException e) {
                        // Handle the exception if the book is not found
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Display all books
                    library.displayBooks(); // Call method to display books in the library
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
