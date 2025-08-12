// Check the Number of Power of Two or Not

// i/p: n=4 ;     o/p: true
// i/p: n=5 ;     o/p: false
// i/p: n=8 ;     o/p: true
// i/p: n=o ;     o/p: false

import java.util.Scanner;

public class Problem_PowerOfTwo {

    // Naive Approach --> O(log n)
    // Repeatedly divide by 2 (explicitly handle 0) 
    public boolean isPow2_Naive(int number){
         if (number == 0) return false;

         while (number != 1)
         {
             if (number % 2 != 0) return false;
             number = number / 2;
         }

         return true;
    }

    // Efficient Approach --> O()
    // Binary Representation Method -->  no of power 2 have only one bit set
    boolean isPower(int number){
        if (number == 0) return false;

        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        Problem_PowerOfTwo obj = new Problem_PowerOfTwo();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Is the number a power of two? " + obj.isPow2_Naive(n));

        System.out.println("Is the number a power of two? " + obj.isPower(n));

    }
}
