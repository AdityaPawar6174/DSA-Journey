package Recursion;

// Print Numbers from 1 to N using recursion

// i/p: n = 4;      o/p: 1 2 3 4
// i/p: n = 5;      o/p: 1 2 3 4 5

public class Problem_Print1toN {

    static void print1toN(int n){
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to test with different inputs
        print1toN(n);

        // imagine the call stack for print1toN(5):
        // main()
        // |-> print1toN(5)
        // |        |-> print1toN(4)
        // |        |        |-> print1toN(3)
        // |        |        |        |-> print1toN(2)
        // |        |        |        |        |-> print1toN(1)
        // |        |        |        |        |        |-> print1toN(0)
        // |        |        |        |        |        -> return
        // |        |        |        |        |-> 1
        // |        |        |        |-> 2
        // |        |        |-> 3
        // |        |-> 4
        // |-> 5

        // Output will be: 1 2 3 4 5
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion stack
}
