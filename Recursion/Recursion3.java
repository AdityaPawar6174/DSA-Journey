package Recursion;

public class Recursion3 {
    static void fun(int n){
        if(n == 0) return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(3);
    }

    // imagine the call stack for fun(3):
    // main()
    // |-> fun(3)
    // |        |-> 3
    // |        |-> fun(2)
    // |        |        |-> 2
    // |        |        |-> fun(1)
    // |        |        |        |-> 1
    // |        |        |        |-> fun(0)
    // |        |        |        |        |-> return
    // |        |        |        |-> 1
    // |        |        |-> 2
    // |        |-> 3
    // -> return

    // Output will be:
    // 3
    // 2
    // 1
    // 1
    // 2
    // 3

}
