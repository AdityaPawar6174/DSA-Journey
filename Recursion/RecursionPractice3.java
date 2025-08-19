package Recursion;

public class RecursionPractice3 {
    // What does this function print for n = 7?
    // Time Complexity: O(log n)
    static void fun2(int n){
        if(n==0) return;

        fun2(n/2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
        int n = 7;
        fun2(n);

        // The call stack for fun2(7):
        // main()
        // |-> fun2(7)
        // |        |-> fun2(3)
        // |        |        |-> fun2(1)
        // |        |        |        |-> fun2(0) -> return
        // |        |        |-> print 1 (7 % 2)
        // |        |-> print 1 (3 % 2)
        // |-> print 1 (7 % 2)
        // -> return

        // Output will be:
        // 1
        // 1
        // 1

        // Basically this function prints the binary representation of the number n in reverse order.
    }
}
