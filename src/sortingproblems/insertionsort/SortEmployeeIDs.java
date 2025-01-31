package sortingproblems.insertionsort;

public class SortEmployeeIDs {

        public static void insertionSort(int arr[]){
            for(int i = 1; i < arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while(j >= 0 && current < arr[j]){
                    arr[j +1] = arr[j];
                    j--;
                }

                arr[j+1] = current;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }

        public static void main(String[] args){
            int arr[] = {21,65,41,10,30,45};
            insertionSort(arr);
        }
}
