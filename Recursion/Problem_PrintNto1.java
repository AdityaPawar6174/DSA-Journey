package Recursion;

// Print Numbers from N to 1 using recursion

// i/p: n = 4;      o/p: 4 3 2 1
// i/p: n = 5;      o/p: 5 4 3 2 1

public class Problem_PrintNto1 {

    static void printNto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to test with different inputs
        printNto1(n);

        // imagine the call stack for printNto1(5):
        // main()
        // |-> printNto1(5)
        // |        |-> 5
        // |        |-> printNto1(4)
        // |        |        |-> 4
        // |        |        |-> printNto1(3)
        // |        |        |        |-> 3
        // |        |        |        |-> printNto1(2)
        // |        |        |        |        |-> 2
        // |        |        |        |        |-> printNto1(1)
        // |        |        |        |        |        |-> 1
        // |        |        |        |        |-> printNto1(0)
        // |        |        |        |        |-> return


        // Output will be: 5 4 3 2 1
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion stack
}
