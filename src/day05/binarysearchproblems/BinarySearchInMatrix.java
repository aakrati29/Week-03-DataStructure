package day05.binarysearchproblems;

public class TargetValueIn2DSortedMatrixProblem {

    private static int[] target(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int left = 0;
        int right = n * m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int column = mid % m;
            int midValue = arr[row][column];

            if (midValue == target) {
                return new int[]{row, column};
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3, 30, 38},
                {20, 52, 54},
                {35, 60, 69}
        };
        int target = 60;
        int[] result = target(arr, target);

        // Print the result
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Target value " + target + " not found in the matrix.");
        }
        else {
            System.out.println("Target value " + target + " found at position (" + result[0] + ", " + result[1] + ").");
        }
    }
}
