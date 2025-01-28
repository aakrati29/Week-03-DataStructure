package day01likedlist.singlylinkedlist.inventorymanagement;

public class Main {
    public static void main(String[] args) {
        Operations inventory = new Operations();

        // Adding items to the inventory
        inventory.addAtEnd("Laptop", 101, 10, 50000);
        inventory.addAtBeginning("Mouse", 102, 50, 500);
        inventory.addAtPosition(2, "Keyboard", 103, 30, 1500);
        inventory.addAtEnd("Monitor", 104, 20, 7000);

        // Display all items
        System.out.println("Initial Inventory:");
        inventory.displayAllItems();

        // Search for an item
        System.out.println("\nSearching for Item ID 103:");
        inventory.searchItem(103, "");

        // Update quantity
        System.out.println("\nUpdating quantity for Item ID 104:");
        inventory.updateQuantityById(104, 25);
        inventory.displayAllItems();

        // Remove an item
        System.out.println("\nRemoving Item ID 102:");
        inventory.removeById(102);
        inventory.displayAllItems();

        // Calculate total inventory value
        System.out.println("\nCalculating total inventory value:");
        inventory.calculateTotalValue();

        // Sort inventory by item name
        System.out.println("\nSorting inventory by Item Name:");
        inventory.sortByName();
        inventory.displayAllItems();
    }
}
