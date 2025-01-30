package day02stackqueuehashing.problemsforstacksandqueues.sortastackusingrecursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(1);
        stack.push(8);
        stack.push(5);
        stack.push(2);

        sortStack(stack);
        System.out.println(stack);
    }

    private static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertElement(stack, temp);
        }
    }

    public static void insertElement(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }
        int item = stack.pop();
        insertElement(stack, element);
        stack.push(item);
    }
}
