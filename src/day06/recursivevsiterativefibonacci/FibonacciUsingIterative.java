package day06.recursivevsiterativefibonacci;

public class FibonacciUsingIterative {
    public void fibonacciByIterative(int n){
        int firstnumber = 0;
        int secondNumber = 1;
        int sum = 0;

        for(int i = 2; i <= n; i++){
            sum = firstnumber + secondNumber;
            firstnumber = secondNumber;
            secondNumber = sum;
        }
    }
}
