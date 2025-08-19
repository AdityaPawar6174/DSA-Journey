package Recursion;

public class RecursionPractice2 {
    // What does this function return for n = 16?
    static int fun(int n){
        if (n == 1) return 0;
        else
            return 1 + fun(n / 2);
    }

    public static void main(String[] args) {
        int result = fun(16);
        System.out.println("The result is: " + result);

        // The call stack for fun(16):
        // main()
        // |-> fun(16)
        // |        |-> 1 + fun(8)
        // |        |        |-> 1 + fun(4)
        // |        |        |        |-> 1 + fun(2)
        // |        |        |        |        |-> 1 + fun(1)
        // |        |        |        |        |        |-> return 0
        // |        |        |        |-> return 1 + 0 = 1
        // |        |        |-> return 1 + 1 = 2
        // |        |-> return 1 + 2 = 3
        // |-> return 1 + 3 = 4
        // -> return 4

        // Output will be:
        // The result is: 4

    }
}
