package day02stackqueuehashing.problemsforhashing.longestconsecutivesequence;

import java.util.HashSet;

class LongestConsecutiveSequence {
        public static int longestConsecutive(int[] arr) {
            if (arr.length == 0) return 0;

            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }

            int longestStreak = 0;

            for (int num : set) {
                // Start counting only if it's the beginning of a sequence
                if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (set.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }

        public static void main(String[] args) {
            int[] arr = {100, 4, 200, 1, 3, 2};
            System.out.println("Longest Consecutive Sequence: " + longestConsecutive(arr));
        }
}

