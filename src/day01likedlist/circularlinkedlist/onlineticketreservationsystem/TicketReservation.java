package day01likedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketReservation {
    private Ticket head;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            head.next = head; // Circular link
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head; // Complete the circular link
        }
        System.out.println("Ticket ID " + ticketId + " reserved for " + customerName + " for movie " + movieName);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev == null) { // Remove the head
                    if (head.next == head) { // Only one ticket in the list
                        head = null;
                    } else {
                        Ticket last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Ticket ID " + ticketId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket ID " + ticketId + " not found.");
    }

    // Display all current tickets in the circular list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        Ticket temp = head;
        System.out.println("Current ticket reservations:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String name) {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(name) || temp.movieName.equalsIgnoreCase(name)) {
                System.out.println("Ticket found: Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No ticket found for " + name);
        }
    }

    // Calculate the total number of booked tickets
    public int totalTickets() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
