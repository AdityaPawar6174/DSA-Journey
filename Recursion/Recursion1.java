package Recursion;

// **************** DO NOT run this program ********************
// A simple recursive function that calls itself indefinitely
public class Recursion1 {

    // Direct Recursion
    static void function(){
        System.out.println("function called");
        function(); // This will call itself indefinitely
    }

    // Indirect Recursion
    static void fun1(){
        System.out.println("function called");
        fun2();
    }

    static void fun2(){
        System.out.println("function called again");
        fun1();
    }

    public static void main(String[] args) {
        // Note: This will cause a StackOverflowError due to infinite recursion.
        // **************** DO NOT run this program ********************
        function();
        fun1();
    }
}
