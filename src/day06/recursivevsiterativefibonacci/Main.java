package day06.recursivevsiterativefibonacci;

public class Main {

    public static long byIterative(int n){
        long startTime,endTime;
        startTime = System.nanoTime();
        FibonacciUsingIterative iterative = new FibonacciUsingIterative();
        iterative.fibonacciByIterative(n);
        endTime = System.nanoTime();

        return endTime-startTime;
    }

    public static long byRecursive(int n){
        long startTime,endTime;
        startTime = System.nanoTime();
        FibonacciUsingRecursion recursion = new FibonacciUsingRecursion();
        recursion.fibonacciByRecursion(n);
        endTime = System.nanoTime();

        return endTime-startTime;
    }
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;
        int n3 = 40;

        System.out.println("Total time taken to solve Fibonacci using Iterative for 10 elements : " + byIterative(n1));
        System.out.println("Total time taken to solve Fibonacci using Iterative for 30 elements : " + byIterative(n2));
        System.out.println("Total time taken to solve Fibonacci using Iterative for 50 elements : " + byIterative(n3));

        System.out.println("\nTotal time taken to solve Fibonacci using Recursion for 10 elements : " + byRecursive(n1));
        System.out.println("Total time taken to solve Fibonacci using Recursion for 30 elements : " + byRecursive(n2));
        System.out.println("Total time taken to solve Fibonacci using Recursion for 50 elements : " + byRecursive(n3));

        //recursive method works but is extremely slow for n = 50
    }
}
