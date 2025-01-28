package day01likedlist.doublylinkedlist.libraryManagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // Add books
        library.addAtBeginning("Harry Potter", "J.K. Rowling", "Fantasy", 101, true);
        library.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 102, true);
        library.addAtPosition(2, "1984", "George Orwell", "Dystopian", 103, true);

        // Display books in forward order
        library.displayForward();

        // Display books in reverse order
        library.displayReverse();

        // Search for a book
        library.searchByTitleOrAuthor("1984", "");

        // Update availability status
        library.updateAvailabilityStatus(102, false);
        library.displayForward();

        // Remove a book
        library.removeByBookID(101);
        library.displayForward();

        // Display total number of books
        System.out.println("Total books in the library: " + library.countTotalBooks());
    }
}
