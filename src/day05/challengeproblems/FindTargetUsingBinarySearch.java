package day05.challengeproblems;

public class FindTargetUsingBinarySearch {

    private static int findTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8};
    int target = 4;
    int result = findTarget(arr,target);
        System.out.println(result);
    }
}
