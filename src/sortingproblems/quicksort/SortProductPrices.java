package sortingproblems.quicksort;

public class SortProductPrices {

        public static int partition(int arr[], int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap arr[i+1] and arr[high] (pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }


        public static void quickSort(int arr[], int low, int high){
            if(low < high){
                int pidx = partition(arr, low, high);

                quickSort(arr, low, pidx-1);
                quickSort(arr, pidx+1, high);
            }
        }

        public static void main(String[] args){
            int arr[] = {21,65,41,10,30,45};
            quickSort(arr,0,arr.length-1);

            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }

        }
}
