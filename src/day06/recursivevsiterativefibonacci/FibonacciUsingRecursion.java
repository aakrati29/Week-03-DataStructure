package day06.recursivevsiterativefibonacci;

public class FibonacciUsingRecursion {

    public int fibonacciByRecursion(int n){
        if (n <= 1)
            return n;
        return fibonacciByRecursion(n - 1) + fibonacciByRecursion(n - 2);

    }
}
