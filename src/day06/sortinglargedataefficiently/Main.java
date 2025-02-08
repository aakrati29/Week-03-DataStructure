package day06.sortinglargedataefficiently;

public class Main {

    public static long bubble(int[] arr){
        long startTime, endTime;
        startTime = System.nanoTime();
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        endTime = System.nanoTime();

        return endTime-startTime;
    }

    public static long merge(int[] arr){
        long startTime, endTime;
        startTime = System.nanoTime();
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, 0, arr.length-1);
        endTime = System.nanoTime();

        return endTime-startTime;
    }

    public static long quick(int[] arr){
        long startTIme, endTime;
        startTIme = System.nanoTime();
        QuickSort ms = new QuickSort();
        ms.quickSort(arr, 0, arr.length-1);
        endTime = System.nanoTime();

        return endTime-startTIme;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[1000];
        for(int i =0; i < 1000; i++){
            arr1[i] = i;
        }

        int[] arr2 = new int[10000];
        for(int i = 0; i < 10000; i++){
            arr2[i] = i;
        }

        int[] arr3 = new int[1000000];
        for(int i = 0; i < 1000000; i++){
            arr3[i] = i;
        }

        System.out.println("\nTotal time taken by Bubble Sort in \"1000\" size of array : " + bubble(arr1));
        System.out.println("Total time taken by Merge Sort in \"10000\" size of array : " + merge(arr2));
        System.out.println("Total time taken by Quick Sort in \"1000000\" size of array : " + quick(arr3));

        System.out.println("\nTotal time taken by Bubble Sort in \"1000\" size of array : " + bubble(arr1));
        System.out.println("Total time taken by Merge Sort in \"10000\" size of array : " + merge(arr2));
        System.out.println("Total time taken by Quick Sort in \"1000000\" size of array : " + quick(arr3));

        System.out.println("\nTotal time taken by Bubble Sort in \"1000\" size of array : " + bubble(arr1));
        System.out.println("Total time taken by Merge Sort in \"10000\" size of array : " + merge(arr2));
        System.out.println("Total time taken by Quick Sort in \"1000000\" size of array : " + quick(arr3));


    }
}
