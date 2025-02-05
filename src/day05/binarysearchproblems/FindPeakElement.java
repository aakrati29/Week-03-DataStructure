package day05.binarysearchproblems;

public class FindPeakElement {

    private static int peakelement(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && mid < arr.length-1){
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return arr[mid];
                }
                else if(arr[mid] < arr[mid-1]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }

            else if(mid == 0){
                if(arr[0] > arr[1]){
                    return arr[0];
                }
                else{
                    return arr[1];
                }
            }

            else if(mid == arr.length-1){
                if(arr[arr.length-1] > arr[arr.length-2]){
                    return arr[arr.length-1];
                }
                else{
                    return arr[arr.length-2];
                }
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int result = peakelement(arr);
        System.out.println(result);
    }
}
