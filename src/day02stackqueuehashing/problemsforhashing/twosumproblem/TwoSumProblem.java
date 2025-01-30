package day02stackqueuehashing.problemsforhashing.twosumproblem;

import java.util.HashMap;

class TwoSumProblem {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Found the pair
            }

            map.put(nums[i], i); // Store index of the current element
        }
        return new int[]{-1, -1}; // No valid pair found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            // Output: Indices: 0, 1
        } else {
            System.out.println("No valid pair found.");
        }
    }
}

