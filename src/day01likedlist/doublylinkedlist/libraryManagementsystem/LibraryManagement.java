package day01likedlist.doublylinkedlist.libraryManagementsystem;

class LibraryManagement {
    private Book head; // Head of the doubly linked list
    private Book tail; // Tail of the doubly linked list
    private int totalBooks = 0;

    // Add a new book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) { // List is empty
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
        System.out.println("Book added at the beginning: " + title);
    }

    // Add a new book at the end
    public void addAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) { // List is empty
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
        System.out.println("Book added at the end: " + title);
    }

    // Add a new book at a specific position
    public void addAtPosition(int position, String title, String author, String genre, int bookID, boolean isAvailable) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        Book newBook = new Book(title, author, genre, bookID, isAvailable);

        if (position == 1) { // Add at the beginning
            addAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }

        Book temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds. Adding at the end.");
            addAtEnd(title, author, genre, bookID, isAvailable);
        } else {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;

            if (newBook.next == null) { // If added at the end
                tail = newBook;
            }

            totalBooks++;
            System.out.println("Book added at position " + position + ": " + title);
        }
    }

    // Remove a book by Book ID
    public void removeByBookID(int bookID) {
        if (head == null) {
            System.out.println("No books in the library to remove.");
            return;
        }

        Book temp = head;

        while (temp != null) {
            if (temp.bookID == bookID) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else { // If it's the head node
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else { // If it's the tail node
                    tail = temp.prev;
                }

                totalBooks--;
                System.out.println("Book with ID " + bookID + " removed.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Search for a book by Title or Author
    public void searchByTitleOrAuthor(String title, String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: Title=" + temp.title + ", Author=" + temp.author + ", Genre=" + temp.genre + ", ID=" + temp.bookID + ", Available=" + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found for Title: \"" + title + "\" or Author: \"" + author + "\".");
        }
    }

    // Update a book's Availability Status
    public void updateAvailabilityStatus(int bookID, boolean newStatus) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = newStatus;
                System.out.println("Availability status updated for Book ID " + bookID);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No books in the library to display.");
            return;
        }

        Book temp = head;
        System.out.println("Books in forward order:");
        while (temp != null) {
            System.out.println("Title=" + temp.title + ", Author=" + temp.author + ", Genre=" + temp.genre + ", ID=" + temp.bookID + ", Available=" + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books in the library to display.");
            return;
        }

        Book temp = tail;
        System.out.println("Books in reverse order:");
        while (temp != null) {
            System.out.println("Title=" + temp.title + ", Author=" + temp.author + ", Genre=" + temp.genre + ", ID=" + temp.bookID + ", Available=" + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    // Count the total number of books in the library
    public int countTotalBooks() {
        return totalBooks;
    }
}
