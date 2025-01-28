package day01likedlist.singlylinkedlist.inventorymanagement;

public class Operations {
        private Item head;

        // Add an item at the beginning
        public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
            Item newItem = new Item(itemName, itemId, quantity, price);
            newItem.next = head;
            head = newItem;
        }

        // Add an item at the end
        public void addAtEnd(String itemName, int itemId, int quantity, double price) {
            Item newItem = new Item(itemName, itemId, quantity, price);
            if (head == null) {
                head = newItem;
                return;
            }
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }

        // Add an item at a specific position (1-based index)
        public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
            if (position < 1) {
                System.out.println("Invalid position!");
                return;
            }

            if (position == 1) {
                addAtBeginning(itemName, itemId, quantity, price);
                return;
            }

            Item newItem = new Item(itemName, itemId, quantity, price);
            Item temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Position out of bounds!");
            } else {
                newItem.next = temp.next;
                temp.next = newItem;
            }
        }

        // Remove an item by Item ID
        public void removeById(int itemId) {
            if (head == null) {
                System.out.println("Inventory is empty!");
                return;
            }

            if (head.itemId == itemId) {
                head = head.next;
                System.out.println("Item with ID " + itemId + " removed.");
                return;
            }

            Item temp = head;
            while (temp.next != null && temp.next.itemId != itemId) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Item with ID " + itemId + " not found.");
            } else {
                temp.next = temp.next.next;
                System.out.println("Item with ID " + itemId + " removed.");
            }
        }

        // Update the quantity of an item by Item ID
        public void updateQuantityById(int itemId, int newQuantity) {
            Item temp = head;
            while (temp != null) {
                if (temp.itemId == itemId) {
                    temp.quantity = newQuantity;
                    System.out.println("Quantity updated for Item ID " + itemId);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Item with ID " + itemId + " not found.");
        }

        // Search for an item by Item ID or Item Name
        public void searchItem(int itemId, String itemName) {
            Item temp = head;
            while (temp != null) {
                if (temp.itemId == itemId || temp.itemName.equalsIgnoreCase(itemName)) {
                    System.out.println("Item Found: Name=" + temp.itemName + ", ID=" + temp.itemId + ", Quantity=" + temp.quantity + ", Price=" + temp.price);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Item not found.");
        }

        // Calculate and display the total value of the inventory
        public void calculateTotalValue() {
            double totalValue = 0;
            Item temp = head;
            while (temp != null) {
                totalValue += temp.quantity * temp.price;
                temp = temp.next;
            }
            System.out.println("Total Inventory Value: " + totalValue);
        }

        // Display all items in the inventory
        public void displayAllItems() {
            if (head == null) {
                System.out.println("Inventory is empty!");
                return;
            }
            Item temp = head;
            System.out.println("Inventory Items:");
            while (temp != null) {
                System.out.println("Name=" + temp.itemName + ", ID=" + temp.itemId + ", Quantity=" + temp.quantity + ", Price=" + temp.price);
                temp = temp.next;
            }
        }

        // Sort the inventory by Item Name (Ascending Order)
        public void sortByName() {
            if (head == null || head.next == null) {
                return;
            }

            Item current, index;
            String tempName;
            int tempId, tempQuantity;
            double tempPrice;

            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.itemName.compareToIgnoreCase(index.itemName) > 0) {
                        // Swap data
                        tempName = current.itemName;
                        tempId = current.itemId;
                        tempQuantity = current.quantity;
                        tempPrice = current.price;

                        current.itemName = index.itemName;
                        current.itemId = index.itemId;
                        current.quantity = index.quantity;
                        current.price = index.price;

                        index.itemName = tempName;
                        index.itemId = tempId;
                        index.quantity = tempQuantity;
                        index.price = tempPrice;
                    }
                }
            }
            System.out.println("Inventory sorted by Item Name.");
        }
    }

