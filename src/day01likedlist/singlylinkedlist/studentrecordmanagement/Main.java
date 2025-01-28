package day01likedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        Operations student = new Operations();
        // Adding students
        student.addAtFront(1, "Aakrati", 20, 'A');
        student.addAtEnd(2, "Bob", 21, 'B');
        student.addAtFront(3, "Alice", 22, 'C');
        student.addSpecificPosition(2, 4, "Ankit", 23, 'A');

        // Display all records
        student.displayAll();

        // Search for a student
        student.searchByRollNumber(2);

        // Update a student's grade
        student.updateGradeByRollNumber(2, 'A');
        student.displayAll();

        // Delete a student
        student.deleteByRollNumber(3);
        student.displayAll();
    }
}
