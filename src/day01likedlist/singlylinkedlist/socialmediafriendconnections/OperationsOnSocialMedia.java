package day01likedlist.singlylinkedlist.socialmediafriendconnections;
import java.util.HashSet;
import java.util.Set;

class OperationOnSocialMedia {
    private User head; // Head of the user linked list

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User " + name + " added.");
    }

    // Find a user by User ID
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        // Add user2 to user1's friend list
        Friend newFriend1 = new Friend(userId2);
        newFriend1.next = user1.friendListHead;
        user1.friendListHead = newFriend1;

        // Add user1 to user2's friend list
        Friend newFriend2 = new Friend(userId1);
        newFriend2.next = user2.friendListHead;
        user2.friendListHead = newFriend2;

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Remove a friend connection between two users
    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendListHead = removeFriendFromList(user1.friendListHead, userId2);
        user2.friendListHead = removeFriendFromList(user2.friendListHead, userId1);

        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    private Friend removeFriendFromList(Friend head, int friendId) {
        if (head == null) return null;
        if (head.friendId == friendId) return head.next;

        Friend current = head;
        while (current.next != null) {
            if (current.next.friendId == friendId) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return head;
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> user1Friends = new HashSet<>();
        Friend temp = user1.friendListHead;
        while (temp != null) {
            user1Friends.add(temp.friendId);
            temp = temp.next;
        }

        System.out.print("Mutual friends between " + user1.name + " and " + user2.name + ": ");
        temp = user2.friendListHead;
        boolean found = false;
        while (temp != null) {
            if (user1Friends.contains(temp.friendId)) {
                System.out.print(temp.friendId + " ");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.print("None");
        System.out.println();
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        Friend temp = user.friendListHead;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Search for a user by Name or User ID
    public void searchUser(String name, int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name) || temp.userId == userId) {
                System.out.println("User Found: Name=" + temp.name + ", UserID=" + temp.userId + ", Age=" + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            int count = 0;
            Friend friendTemp = temp.friendListHead;
            while (friendTemp != null) {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println("User " + temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}
