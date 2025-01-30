package day02stackqueuehashing.problemsforstacksandqueues.implementaqueueusingstacks;

import java.util.Stack;

public class ImplementingQueueUsingStacks {
    public static void enqueue(Stack<Integer> stack,int data){
        stack.push(data);
    }
    public static void dequeue(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        if (stack.isEmpty()){
            System.out.println("Stack is already empty!");
            return;
        }
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        System.out.println("Element is removed : "+temp.pop());
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
    public static void main(String [] args){
        Stack<Integer> s1 = new Stack<>();

        enqueue(s1,3);
        enqueue(s1,2);
        enqueue(s1,1);

        dequeue(s1);

        System.out.println(s1);

    }
}
