package day02stackqueuehashing.problemsforhashing.checkforapairwithgivensuminanarray;

import java.util.HashSet;
import java.util.Set;

public class PairGivenSumInAnArray {

    public static boolean checkTargetSum(int arr[], int target){
        Set<Integer> set= new HashSet<>();
        for(int i :arr){
            set.add(i);
        }
        System.out.println(set);
        for(int i :set){
            int rest = target-i;
            if(set.contains(rest)){
                System.out.println(i+" "+rest);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[]={5,6,7,8,9,5};
        int target = 10;

        if(checkTargetSum(arr,target)){
            System.out.println("Target found");
        }
    }
}
