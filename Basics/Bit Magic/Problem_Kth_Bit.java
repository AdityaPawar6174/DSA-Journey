// Check if Kth bit is set in binary or not

// i/p: n=5; k = 1;     n=00...010{1}   o/p: yes
// i/p: n=9; k = 2;     n=00...10{0}1   o/p: no
// i/p: n=0; k = 3;     n=00...0{0}00   o/p: no

import java.util.Scanner;

public class Problem_Kth_Bit {

    // Idea --> Check the Last bit of number
    // if((n & 1) != 0) yes; else no; // & is Bitwise operator to check if the number is odd or even
    // if LSB = 1, then Odd
    // if LSB = 0, then Even

    // Idea --> To check if Kth bit is set, 2^k-1 is used

    // Naive Approach --> O(k)
    void isSet_Naive(int n, int k)
    {
        int x = 1;
        for (int i=0; i<(k-1); i++){
            x = x * 2; // x = 2^(k-1)
        }

        if ((n & x) != 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    // Efficient Method I
    void isSet_LeftShift(int n, int k)
    {
        int x = (1 << (k - 1)); // 2^(k-1) ---> Left shift 1 by (k-1) positions to get 2^(k-1)

        if ((n & x) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Efficient Method II
    void isSet_RightShift(int n, int k)
    {
        int x = (n >> (k - 1)); // n / 2^(k-1) ---> Left shift 1 by (k-1) positions to get 2^(k-1)

        if ((x & 1) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Problem_Kth_Bit obj = new Problem_Kth_Bit();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the position of the bit (k): ");
        int k = sc.nextInt();
        sc.close();

        // Using Naive Approach
        System.out.println("Using Naive Approach:");
        obj.isSet_Naive(n, k);

        // Using Efficient Method I
        System.out.println("Using Efficient Method I:");
        obj.isSet_LeftShift(n, k);

        // Using Efficient Method II
        System.out.println("Using Efficient Method II:");
        obj.isSet_RightShift(n, k);

    }
}
