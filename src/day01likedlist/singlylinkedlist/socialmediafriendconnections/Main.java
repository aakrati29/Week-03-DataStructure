package day01likedlist.singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        OperationOnSocialMedia sm = new OperationOnSocialMedia();

        System.out.println("-----------------Added user-------------------");
        // Add users
        sm.addUser(1, "Aakrati", 21);
        sm.addUser(2, "Ankit", 20);
        sm.addUser(3, "Anand", 23);
        sm.addUser(4, "Avinash", 22);

        System.out.println("--------------Friends connection--------------------");
        // Add friend connections
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 4);

        // Display all friends
        sm.displayFriends(1);
        sm.displayFriends(2);

        System.out.println("------------------Mutual Friends------------------");
        // Find mutual friends
        sm.findMutualFriends(1, 2);

        System.out.println("------------------Search for a user------------------");
        // Search for a user
        sm.searchUser("Aakrati", 0);
        sm.searchUser("", 3);

        System.out.println("------------------Count friends for each user-----------------");
        // Count friends for each user
        sm.countFriends();

        System.out.println("------------------Removed Friends------------------");
        // Remove a friend connection
        sm.removeFriend(1, 3);
        sm.displayFriends(1);

        System.out.println("---------------Total friends-------------------");
        // Count friends again
        sm.countFriends();
    }
}
