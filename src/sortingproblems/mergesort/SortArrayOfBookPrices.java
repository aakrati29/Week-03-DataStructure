package sortingproblems.mergesort;

public class SortArrayOfBookPrices {

        public static void conquer(int arr[], int start, int mid, int end){
            int merge[] = new int[end - start + 1];

            int idx1 = start;
            int idx2 = mid + 1;
            int x = 0;

            while (idx1 <= mid && idx2 <= end) {
                if (arr[idx1] < arr[idx2]) {
                    merge[x++] = arr[idx1++];
                }
                else {
                    merge[x++] = arr[idx2++];
                }
            }

            while (idx1 <= mid) {
                merge[x++] = arr[idx1++];
            }

            while (idx2 <= end) {
                merge[x++] = arr[idx2++];
            }

            for (int i = 0; i < merge.length; i++) {
                arr[start + i] = merge[i];
            }
        }


        public static void divide(int arr[], int start, int end){
            if(start<end){
                int mid = start + (end - start)/2;

                divide(arr, start, mid);
                divide(arr, mid+1, end);
                conquer(arr, start, mid, end);
            }
        }

        public static void main(String[] args){
            int arr[] = {21,65,41,10,30,45};
            divide(arr, 0, arr.length-1);

            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }
}
