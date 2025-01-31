package sortingproblems.bubblesortstudentmarks;

public class SortStudentMarks {

    public static void sortStudentMarks(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,35,41,10,20};
        sortStudentMarks(arr);
    }
}
