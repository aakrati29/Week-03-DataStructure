package day06.sortinglargedataefficiently;

import java.util.Random;

public class QuickSort {

    private int partition(int[] arr, int low, int high) {
        // Randomized pivot selection
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1);

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            int pidx = partition(arr, low, high);

            // Optimize tail recursion: Recur for smaller part first
            if (pidx - low < high - pidx) {
                quickSort(arr, low, pidx - 1);
                low = pidx + 1;
            } else {
                quickSort(arr, pidx + 1, high);
                high = pidx - 1;
            }
        }
    }
}
