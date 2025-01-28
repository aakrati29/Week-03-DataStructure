package day01likedlist.doublylinkedlist.libraryManagementsystem;

class Book {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    Book prev; // Pointer to the previous node
    Book next; // Pointer to the next node

    Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
