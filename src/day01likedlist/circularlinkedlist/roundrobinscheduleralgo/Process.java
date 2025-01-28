package day01likedlist.circularlinkedlist.roundrobinscheduleralgo;

class Process {
    int processId;
    int burstTime;
    int priority;
    int remainingBurstTime;
    Process next;

    // Constructor for process
    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingBurstTime = burstTime; // initially, the remaining burst time is the same as the burst time
        this.next = null;
    }
}