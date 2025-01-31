package sortingproblems.selectionsort;

public class SortExamScores {

        public static void selectionSort(int arr[]){
            for(int i = 0; i < arr.length-1; i++){
                int smallest = i;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[smallest] > arr[j]){
                        smallest = j;
                    }
                }

                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }

            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }

        public static void main(String[] args){
            int arr[] = {21,65,41,10,30,45};
            selectionSort(arr);
        }
}
