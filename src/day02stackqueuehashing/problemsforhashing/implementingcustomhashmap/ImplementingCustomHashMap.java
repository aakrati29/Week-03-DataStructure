package day02stackqueuehashing.problemsforhashing.implementingcustomhashmap;

    import java.util.LinkedList;

    class CustomHashMap<K, V> {
        private static final int SIZE = 16; // Default size of hash table
        private LinkedList<Node<K, V>>[] buckets;

        // Node class for storing key-value pairs
        private static class Node<K, V> {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        @SuppressWarnings("unchecked")
        public CustomHashMap() {
            buckets = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int getBucketIndex(K key) {
            return Math.abs(key.hashCode() % SIZE);
        }

        // Insert or update a key-value pair
        public void put(K key, V value) {
            int index = getBucketIndex(key);
            LinkedList<Node<K, V>> bucket = buckets[index];

            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    node.value = value; // Update existing key
                    return;
                }
            }
            bucket.add(new Node<>(key, value)); // Insert new key-value pair
        }

        // Retrieve value associated with a key
        public V get(K key) {
            int index = getBucketIndex(key);
            LinkedList<Node<K, V>> bucket = buckets[index];

            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return null; // Key not found
        }

        // Remove a key from the map
        public void remove(K key) {
            int index = getBucketIndex(key);
            LinkedList<Node<K, V>> bucket = buckets[index];

            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    bucket.remove(node);
                    return;
                }
            }
        }

        // Print the contents of the hash map
        public void printMap() {
            for (int i = 0; i < SIZE; i++) {
                if (!buckets[i].isEmpty()) {
                    System.out.print("Bucket " + i + ": ");
                    for (Node<K, V> node : buckets[i]) {
                        System.out.print("[" + node.key + " -> " + node.value + "] ");
                    }
                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {
            CustomHashMap<String, Integer> map = new CustomHashMap<>();
            map.put("one", 1);
            map.put("two", 2);
            map.put("three", 3);
            map.put("two", 22); // Update value

            System.out.println("Get 'two': " + map.get("two")); // Output: 22
            map.remove("three");

            System.out.println("After deletion:");
            map.printMap();
        }
}
