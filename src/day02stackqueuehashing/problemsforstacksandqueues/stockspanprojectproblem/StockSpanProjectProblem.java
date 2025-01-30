package day02stackqueuehashing.problemsforstacksandqueues.stockspanprojectproblem;

import java.util.Stack;

public class StockSpanProjectProblem {

    public static int[] spanCalculator(int[] prices){
        int n = prices.length;
        int span[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }

            span[i] = (stack.isEmpty()) ? (i+1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }
    public static void main(String [] args){
        int prices[] = {100,50,90,95,40};
        int span[] = spanCalculator(prices);
        for(int sp : span){
            System.out.print(sp + " ");
        }
    }
}
