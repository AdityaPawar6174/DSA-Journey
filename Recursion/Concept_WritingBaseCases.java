package Recursion;

public class Concept_WritingBaseCases {

    // Base cases are essential in recursion to prevent infinite loops and to provide a stopping condition.
    // They define the simplest form of the problem that can be solved directly without further recursion.

    // Example of a base case in a recursive function:
    static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1; // Factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    // Nth Fibonacci number using recursion with base cases
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base case for Fibonacci
        if (n == 1) return 1; // Base case for Fibonacci
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        int fibIndex = 6;
        System.out.println("Fibonacci number at index " + fibIndex + " is: " + fibonacci(fibIndex));
    }
}
