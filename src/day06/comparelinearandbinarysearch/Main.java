package day06.comparelinearandbinarysearch;

public class Main {
    public static long linear(int[] arr, int target){
        long start, end;
        start = System.nanoTime();
        LinearSearch ls = new LinearSearch();
        ls.linearSearch(arr,5);
        end=System.nanoTime();

        return end-start;
    }

    public static long binary(int[] arr, int target){
        long start, end;
        start = System.nanoTime();
        BinarySearch bs = new BinarySearch();
        bs.binarySearch(arr, 101);
        end = System.nanoTime();

        return  end-start;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[1000];
        for(int i =0; i < 1000; i++){
            arr1[i] = 1000-i-1;
        }

        int[] arr2 = new int[10000];
        for(int i = 0; i < 10000; i++){
            arr2[i] = 10000-i-1;
        }

        int[] arr3 = new int[100000];
        for(int i = 0; i < 100000; i++){
            arr3[i] = 100000-i-1;
        }

        System.out.println("Total time taken by Linear Search in 1000 size of array : " + linear(arr1,5));
        System.out.println("Total time taken by Binary Search in 1000 size of array : " + binary(arr1,5));

        System.out.println("\nTotal time taken by Linear Search in 1000 size of array : " + linear(arr2,5));
        System.out.println("Total time taken by Binary Search in 1000 size of array : " + binary(arr2,5));

        System.out.println("\nTotal time taken by Linear Search in 1000 size of array : " + linear(arr3,5));
        System.out.println("Total time taken by Binary Search in 1000 size of array : " + binary(arr3,5));
}
}
