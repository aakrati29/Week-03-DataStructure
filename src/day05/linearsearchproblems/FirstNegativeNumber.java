package day05.linearsearchproblems;

public class FirstNegativeNumber {
    public static void main(String[] args) {
    int arr[] = {2,5,-4,9,-1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.println(i);
                break;
            }
        }
    }
}
