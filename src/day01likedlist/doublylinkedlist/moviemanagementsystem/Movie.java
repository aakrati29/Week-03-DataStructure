package day01likedlist.doublylinkedlist.moviemanagementsystem;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie prev; // Pointer to the previous node
    Movie next; // Pointer to the next node

    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
