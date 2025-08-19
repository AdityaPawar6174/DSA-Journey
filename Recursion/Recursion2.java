package Recursion;

// Recursion example: A simple recursive function that prints a message

// A conditional recursive function that stops when n reaches 0
// This is a safe recursive function that will not cause a StackOverflowError
public class Recursion2 {
    static void fun1(int n){
        if (n == 0) return; // Base case to stop recursion

        System.out.println("function called with n = " + n);
        fun1(n-1); // Recursive case
    }

    public static void main(String[] args) {
        fun1(5);
    }
}
