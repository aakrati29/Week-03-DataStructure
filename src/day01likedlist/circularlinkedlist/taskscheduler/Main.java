package day01likedlist.circularlinkedlist.taskscheduler;

class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addAtEnd(1, "Task A", 2, "06-01-2025");
        scheduler.addAtEnd(2, "Task B", 1, "08-01-2025");
        scheduler.addAtBeginning(3, "Task C", 3, "10-01-2025");
        scheduler.addAtPosition(2, 4, "Task D", 2, "16-01-2025");

        // Display all tasks
        scheduler.displayAllTasks();

        // View current task and move to next
        scheduler.viewAndMoveToNext();
        scheduler.viewAndMoveToNext();

        // Search tasks by priority
        scheduler.searchByPriority(2);

        // Remove a task
        scheduler.removeByTaskId(2);
        scheduler.displayAllTasks();

        // View current task
        scheduler.viewAndMoveToNext();
    }
}
