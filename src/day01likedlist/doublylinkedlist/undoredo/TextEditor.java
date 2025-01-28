package day01likedlist.doublylinkedlist.undoredo;

class TextEditor {
    private TextState head; // Start of the doubly linked list
    private TextState tail; // End of the doubly linked list
    private TextState current; // Current state of the text editor
    private int maxHistory; // Maximum number of states to retain
    private int size; // Current number of states

    TextEditor(int maxHistory) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.maxHistory = maxHistory;
        this.size = 0;
    }

    // Add a new text state at the end of the list
    public void addTextState(String newText) {
        TextState newState = new TextState(newText);

        // If it's the first state
        if (head == null) {
            head = tail = current = newState;
            size = 1;
        } else {
            // If adding a new state after undo operations, discard future states
            if (current != tail) {
                current.next = null;
                tail = current;
            }

            // Add new state at the end
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;

            // Increment size and maintain max history
            size++;
            if (size > maxHistory) {
                head = head.next; // Remove the oldest state
                head.prev = null;
                size--;
            }
        }

        System.out.println("Text updated: " + newText);
    }

    // Undo: Revert to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: Current state: " + current.content);
        } else {
            System.out.println("Undo not possible. Already at the earliest state.");
        }
    }

    // Redo: Revert to the next state after undo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: Current state: " + current.content);
        } else {
            System.out.println("Redo not possible. Already at the latest state.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.content);
        } else {
            System.out.println("No text states available.");
        }
    }

    // Display all states (for debugging)
    public void displayAllStates() {
        TextState temp = head;
        System.out.println("All states in the history:");
        while (temp != null) {
            System.out.print(temp.content + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
