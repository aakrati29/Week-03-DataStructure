package day01likedlist.singlylinkedlist.socialmediafriendconnections;

class User {
    int userId;
    String name;
    int age;
    Friend friendListHead; // Head of the Friend IDs list
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendListHead = null;
        this.next = null;
    }
}
