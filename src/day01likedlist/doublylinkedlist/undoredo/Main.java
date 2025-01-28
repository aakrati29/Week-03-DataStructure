package day01likedlist.doublylinkedlist.undoredo;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        // Add new states
        editor.addTextState("Hello");
        editor.addTextState("Hello World");
        editor.addTextState("Hello World!");
        editor.addTextState("Hello World! How are you?");

        // Display current state
        editor.displayCurrentState();

        // Undo operations
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Redo operations
        editor.redo();
        editor.displayCurrentState();

        // Add new state after undo
        editor.addTextState("Hello World! It's a beautiful day.");
        editor.displayCurrentState();

        // Display all states
        editor.displayAllStates();
    }
}
