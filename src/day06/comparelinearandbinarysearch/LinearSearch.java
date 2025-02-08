package day06.comparelinearandbinarysearch;

public class LinearSearch {

    public boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
