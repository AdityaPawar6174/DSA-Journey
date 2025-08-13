// Powerset using Bitwise operations
// The power set of a set is the set of all subsets, including the empty set and
// the set itself. The number of subsets of a set with n elements is 2^
// n, and each subset can be represented by a binary number where each bit
// indicates whether an element is included in the subset or not.

import java.util.Scanner;

public class PowerSet_UsingBitwise {
 
    // Time Complexity --> O(2^n * n)
    public void printPowerSet(String string){
        int n = string.length();
        int powerSetSize = (1 << n); // 2^n using left shift operator -- for example, if n=3, then 2^3 = 8, which is 1 << 3
        // powerSetSize = 2^n used to determine the number of subsets
        for (int i=0; i<powerSetSize; i++){
            for (int j=0; j<n; j++){
                // Check if jth bit of i is set
                // If it is set, include the jth character of string in the current subset
                if ((i & (1 << j)) != 0) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println("\n");
        }
        System.out.println("Total number of subsets: " + powerSetSize);
    }

    public static void main(String[] args) {
        PowerSet_UsingBitwise obj = new PowerSet_UsingBitwise();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("Power Set of the given string is: ");
        obj.printPowerSet(inputString);
        sc.close();
    }
}
