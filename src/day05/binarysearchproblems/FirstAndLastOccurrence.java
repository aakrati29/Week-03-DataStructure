package day05.binarysearchproblems;

public class FirstAndLastOccurrence {

    private static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] > target){
                right = mid - 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }

    private static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
                if(arr[mid] > target){
                   right = mid-1;
                }
                else if(arr[mid] < target){
                    left = mid+1;
                }
                else {
                    result = mid;
                    right = mid - 1;
                }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 6, 7};
        int target = 5;
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        System.out.println("Index of first occurrence " + first + " and index of second occurrence is " + last);
    }
}

