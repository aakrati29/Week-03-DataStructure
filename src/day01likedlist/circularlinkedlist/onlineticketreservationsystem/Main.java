package day01likedlist.circularlinkedlist.onlineticketreservationsystem;


public class Main {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();

        // Add some ticket reservations
        system.addTicket(1, "Alice", "Avatar 2", 5, "2025-01-28 14:30");
        system.addTicket(2, "Bob", "Avengers: Endgame", 10, "2025-01-28 15:00");
        system.addTicket(3, "Charlie", "Spider-Man: No Way Home", 15, "2025-01-28 16:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by customer name
        system.searchTicket("Alice");

        // Remove a ticket by Ticket ID
        system.removeTicket(2);

        // Display all tickets after removal
        system.displayTickets();

        // Get total booked tickets
        int totalTickets = system.totalTickets();
        System.out.println("Total booked tickets: " + totalTickets);
    }
}