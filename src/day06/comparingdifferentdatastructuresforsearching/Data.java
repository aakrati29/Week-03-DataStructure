package day06.comparingdifferentdatastructuresforsearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

class Data {
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size * 10);
        }
        return array;
    }

    public static HashSet<Integer> generateHashSet(int[] array) {
        return new HashSet<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
    }

    public static TreeSet<Integer> generateTreeSet(int[] array) {
        return new TreeSet<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
    }
}
