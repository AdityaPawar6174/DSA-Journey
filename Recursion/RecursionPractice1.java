package Recursion;

public class RecursionPractice1 {
    static void fun(int n){
        if(n == 0) return;
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }

    public static void main(String[] args) {
        fun(3);
    }

    // imagine the call stack for fun(3):
    // main()
    // |-> fun(3)
    // |        |-> fun(2)
    // |        |        |-> fun(1)
    // |        |        |        |-> fun(0) -> return
    // |        |        |        |-> 1
    // |        |        |        |-> fun(0) -> return
    // |        |        |-> 2
    // |        |        |
    // |        |        |-> fun(1)
    // |        |        |        |-> fun(0) -> return
    // |        |        |        |-> 1
    // |        |        |        |-> fun(0) -> return
    // |        |-> 3
    // |        |-> fun(2)
    // |        |        |-> fun(1)
    // |        |        |        |-> fun(0) -> return
    // |        |        |        |-> 1
    // |        |        |        |-> fun(0) -> return
    // |        |        |-> 2
    // |        |        |
    // |        |        |-> fun(1)
    // |        |        |        |-> fun(0) -> return
    // |        |        |        |-> 1
    // |        |        |        |-> fun(0) -> return
    // -> return

    // Output will be:
    // 1
    // 2
    // 1
    // 3
    // 1
    // 2
    // 1
}

