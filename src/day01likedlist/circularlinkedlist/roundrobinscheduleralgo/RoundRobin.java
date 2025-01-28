package day01likedlist.circularlinkedlist.roundrobinscheduleralgo;

class RoundRobin {
    private Process head;
    private Process current; // The process currently being executed

    // Add a process at the end of the circular linked list (queue)
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head; // Circular link
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head; // Complete the circular link
        }
        System.out.println("Process " + processId + " added with burst time " + burstTime + " and priority " + priority);
    }

    // Remove a process by Process ID after execution
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (prev == null) { // Remove the head
                    if (head.next == head) { // Only one process in the queue
                        head = null;
                    } else {
                        Process last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Process " + processId + " removed after execution.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process " + processId + " not found.");
    }

    // Simulate round robin scheduling with a fixed time quantum
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;
        Process temp = head;

        while (temp != null && processCount < 5) { // Maximum of 5 processes for the example
            if (temp.remainingBurstTime > 0) {
                int execTime = Math.min(temp.remainingBurstTime, timeQuantum);
                temp.remainingBurstTime -= execTime;

                System.out.println("Executing Process " + temp.processId + " for " + execTime + " units.");
                displayProcesses();

                if (temp.remainingBurstTime == 0) {
                    removeProcess(temp.processId);
                    processCount++;
                }
            }
            temp = temp.next;
        }

        System.out.println("All processes executed. Scheduling complete.");
    }

    // Display processes in the circular queue after each round
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }
        Process temp = head;
        System.out.println("Processes in the queue:");
        do {
            System.out.println("ID=" + temp.processId + ", Burst=" + temp.burstTime + ", Remaining=" + temp.remainingBurstTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Calculate the average waiting time and turn-around time for all processes
    public void calculateAvgTimes() {
        int totalWaitingTime = 0, totalTurnaroundTime = 0;
        int processCount = 0;
        Process temp = head;

        // Calculate the total waiting time and turnaround time
        while (temp != null) {
            totalWaitingTime += temp.burstTime - temp.remainingBurstTime; // Simple formula for waiting time
            totalTurnaroundTime += temp.burstTime; // Turnaround time = burst time
            processCount++;
            temp = temp.next;
        }
        if (processCount > 0) {
            System.out.println("Average Waiting Time: " + (totalWaitingTime / processCount));
            System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / processCount));
        } else {
            System.out.println("No processes to calculate times.");
        }
    }
}
