package day01likedlist.doublylinkedlist.moviemanagementsystem;

class MovieManagement {
    private Movie head; // Head of the list
    private Movie tail; // Tail of the list

    // Add a movie record at the beginning
    public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) { // List is empty
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        System.out.println("Movie added at the beginning: " + title);
    }

    public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) { // List is empty
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("Movie added at the end: " + title);
    }

    // Add a movie record at a specific position
    public void addAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Movie newMovie = new Movie(title, director, yearOfRelease, rating);

        if (position == 1) { // Add at the beginning
            addAtBeginning(title, director, yearOfRelease, rating);
            return;
        }

        Movie temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds. Adding at the end.");
            addAtEnd(title, director, yearOfRelease, rating);
        } else {
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            newMovie.prev = temp;

            if (newMovie.next == null) { // If added at the end
                tail = newMovie;
            }

            System.out.println("Movie added at position " + position + ": " + title);
        }
    }

    // Remove a movie record by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movie records to remove.");
            return;
        }

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
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

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    // Search for a movie record by Director or Rating
    public void searchByDirectorOrRating(String director, double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Movie Found: Title=" + temp.title + ", Director=" + temp.director + ", Year=" + temp.yearOfRelease + ", Rating=" + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for Director: " + director + " or Rating: " + rating);
        }
    }

    // Display all movie records in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movie records to display.");
            return;
        }

        Movie temp = head;
        System.out.println("Movies in forward order:");
        while (temp != null) {
            System.out.println("Title=" + temp.title + ", Director=" + temp.director + ", Year=" + temp.yearOfRelease + ", Rating=" + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movie records in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movie records to display.");
            return;
        }

        Movie temp = tail;
        System.out.println("Movies in reverse order:");
        while (temp != null) {
            System.out.println("Title=" + temp.title + ", Director=" + temp.director + ", Year=" + temp.yearOfRelease + ", Rating=" + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie: " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie with title \"" + title + "\" not found.");
    }
}
