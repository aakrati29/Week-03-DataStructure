package day01likedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.*;

class Friend {
    int friendId; // Friend's User ID
    Friend next;

    Friend(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
