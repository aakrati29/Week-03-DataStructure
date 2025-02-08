package day06.comparingdifferentdatastructuresforsearching;

public class SearchingUsingArray {
    public void inArray(int[] arr, int key) {
        for (int idx : arr) {
            if (idx == key) {
                return;
            }
        }
    }
}
