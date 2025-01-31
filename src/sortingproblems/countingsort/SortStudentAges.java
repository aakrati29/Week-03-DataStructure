package sortingproblems.countingsort;

public class SortStudentAges {

        public static void countingSort(int ages[]) {
            int minAge = 10, maxAge = 18;
            int range = maxAge - minAge + 1;

            int count[] = new int[range];

            for (int age : ages) {
                count[age - minAge]++;
            }

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            int sortedAges[] = new int[ages.length];
            for (int i = ages.length - 1; i >= 0; i--) {
                int age = ages[i];
                sortedAges[count[age - minAge] - 1] = age;
                count[age - minAge]--;
            }

            System.arraycopy(sortedAges, 0, ages, 0, ages.length);
        }

        public static void main(String[] args) {
            int ages[] = {12, 18, 10, 14, 16, 11, 10, 17, 13, 15, 14, 12, 18};

            System.out.println("Original Ages:");
            System.out.println(Arrays.toString(ages));

            // Sorting the student ages
            countingSort(ages);

            System.out.println("\nSorted Ages:");
            System.out.println(Arrays.toString(ages));
        }
}
