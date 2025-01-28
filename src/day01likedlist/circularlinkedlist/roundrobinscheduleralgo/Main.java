package day01likedlist.circularlinkedlist.roundrobinscheduleralgo;

public class Main {
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();

        // Add processes to the scheduler
        scheduler.addProcess(1, 10, 3);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 2);
        scheduler.addProcess(4, 6, 4);
        scheduler.addProcess(5, 7, 2);

        // Simulate round robin scheduling with time quantum of 3 units
        scheduler.roundRobinScheduling(3);

        // Calculate average waiting and turnaround times
        scheduler.calculateAvgTimes();
    }
}
