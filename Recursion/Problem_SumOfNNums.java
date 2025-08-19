package Recursion;

// Sum of first N natural numbers using recursion

// i/p: n = 2;      o/p: 3 (1 + 2)
// i/p: n = 4;      o/p: 10 (1 + 2 + 3 + 4)
// i/p: n = 5;      o/p: 15 (1 + 2 + 3 + 4 + 5)

import java.util.Scanner;

public class Problem_SumOfNNums {

    static int getSum(int n){
        if (n == 0)
            return 0;

        return n + getSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        int sum = getSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    // Time Complexity: O(n)

}

