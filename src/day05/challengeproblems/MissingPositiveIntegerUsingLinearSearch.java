package day05.challengeproblems;

public class MissingPositiveIntegerUsingLinearSearch {

    private static int findMissingPI(int[] arr) {
        int max = maxNumber(arr);
        if (max < 1) {
            return 1;
        }

        boolean[] present = new boolean[max + 2];

        for (int i : arr) {
            if (i > 0 && i <= max) {
                present[i] = true;
            }
        }

        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return max + 1;
    }

    private static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1};
        int result = findMissingPI(arr);
        System.out.println("First missing positive integer: " + result);
    }
}
