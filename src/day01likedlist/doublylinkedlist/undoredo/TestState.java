package day01likedlist.doublylinkedlist.undoredo;

class TextState {
    String content;
    TextState prev; // Pointer to the previous state
    TextState next; // Pointer to the next state

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
