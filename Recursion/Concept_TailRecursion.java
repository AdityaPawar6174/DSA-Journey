package Recursion;


public class Concept_TailRecursion {

    // Tail Recursion is a special case of recursion where the recursive call is the last operation in the function.
    // This allows for optimizations by the compiler or interpreter, potentially reducing the space complexity.

    // Function that prints Num 1 to N
    void fun1(int n){
        if (n == 0) return;
        System.out.println(n);
        fun1(n - 1);
    }
    // ---------> This takes less time on modern compilers because it is TAIL RECURSIVE.


    // Function that prints Num N to 1
    void fun2(int n){
        if (n == 0) return;
        fun2(n - 1);
        System.out.println(n);
    }
    // ---------> This is NOT TAIL RECURSIVE, as the recursive call is not the last operation in the function.
    // ---------> This can lead to a stack overflow for large values of n, as it uses more stack space due to the recursive calls not being optimized.

    // how to convert this function to tail recursion? (not easy for all non tail recursive functions)
    void fun2_Tail(int n, int k){
        if (n == 0) return;
        System.out.println(k);
        fun2_Tail(n - 1, k + 1);
    }


}

// Visualize the functions to get idea of how they work <--- (Problem_Print1toN.java) & (Problem_PrintNto1.java)
