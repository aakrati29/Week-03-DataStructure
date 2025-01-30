package day02stackqueuehashing.problemsforstacksandqueues.circulartourproblem;

class CircularTour {
    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0, currSurplus = 0, startIndex = 0;

        for (int i = 0; i < n; i++) {
            int netPetrol = petrol[i] - distance[i];
            totalSurplus += netPetrol;
            currSurplus += netPetrol;

            // If current surplus becomes negative, reset start index
            if (currSurplus < 0) {
                startIndex = i + 1;
                currSurplus = 0;
            }
        }

        // If total surplus is negative, tour is not possible
        return totalSurplus >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);
        System.out.println(start == -1 ? "No solution" : "Start at petrol pump " + start);
    }
}

