package day01likedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement movieManager = new MovieManagement();

        System.out.println("----------------Movie Records--------------------");
        // Add movie records
        movieManager.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movieManager.addAtEnd("Titanic", "James Cameron", 1997, 7.8);
        movieManager.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display movies in forward order
        movieManager.displayForward();

        // Display movies in reverse order
        movieManager.displayReverse();

        // Search for a movie by director or rating
        movieManager.searchByDirectorOrRating("Christopher Nolan", 7.8);

        System.out.println("------------------Rating-------------------");
        // Update movie rating
        movieManager.updateRating("Titanic", 8.0);
        movieManager.displayForward();

        System.out.println("--------------Removed Movie--------------------");
        // Remove a movie by title
        movieManager.removeByTitle("Inception");
        movieManager.displayForward();
    }
}
