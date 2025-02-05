package day05.binarysearchproblems;

public class FindRotationPoint {
    private static int rotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else{
               right= mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int result = rotationPoint(arr);
        System.out.println(result);
    }
}
