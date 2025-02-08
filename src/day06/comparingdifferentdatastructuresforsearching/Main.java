package day06.comparingdifferentdatastructuresforsearching;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static long searchArray(int[] arr, int key) {
        long startTime, endTime;
        startTime = System.nanoTime();
        SearchingUsingArray array = new SearchingUsingArray();
        array.inArray(arr, key);
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long usingHashSet(HashSet<Integer> set, int key) {
        long startTime, endTime;
        startTime = System.nanoTime();
        SearchingUsingHashSet hash = new SearchingUsingHashSet();
        hash.usingHashSet(set, key);
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long usingTreeSet(TreeSet<Integer> set, int key) {
        long startTime, endTime;
        startTime = System.nanoTime();
        SearchingUsingTreeSet tree = new SearchingUsingTreeSet();
        tree.usingTreeSet(set, key);
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int size : sizes) {
            System.out.println("\nTesting for N = " + size);

            int[] array = Data.generateArray(size);
            HashSet<Integer> hashSet = Data.generateHashSet(array);
            TreeSet<Integer> treeSet = Data.generateTreeSet(array);

            int searchKey = array[size / 2];

        }
    }
}
