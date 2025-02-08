package day06.comparelinearandbinarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] < target){
                left = mid+1;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
        }
        return left;
    }
}
