package day01likedlist.singlylinkedlist.studentrecordmanagement;

public class Operations {
    private Student head;

    // Add a node in front
    public void addAtFront(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a node in the last
    public void addAtEnd(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        if(head == null){
            head = newStudent;
            return;
        }
        Student temp = head;
        while(temp.next  != null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add a node in specific position given by user
    public void addSpecificPosition(int position, int rollNumber, String name, int age, char grade){
        if(position < 1){
            System.out.println("Invalid position");
            return;
        }
            if(position == 0){
                addAtFront(rollNumber, name, age, grade);
                return;
            }
            Student newStudent = new Student(rollNumber, name, age, grade);
            Student temp = head;
            int i=0;

            while(i < position-1){
                temp = temp.next;
                i++;
            }
            newStudent.next = temp.next;
            temp.next = newStudent;
        }

    // Delete a student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student record deleted.");
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student record deleted.");
        }
    }

    // Search for a student by Roll Number
    public void searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll Number=" + temp.rollNumber + ", Name=" + temp.name + ", Age=" + temp.age + ", Grade=" + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Update a student's grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll Number=" + temp.rollNumber + ", Name=" + temp.name + ", Age=" + temp.age + ", Grade=" + temp.grade);
            temp = temp.next;
        }
    }
    }
