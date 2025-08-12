// Count Set Bits in an Integer

// i/p: n = 5;       o/p: 2     // Binary: 0101
// i/p: n = 7;       o/p: 3     // Binary: 0111
// i/p: n = 13;      o/p: 3     // Binary: 1101

import java.util.Scanner;

public class Problem_CountSetBits {

    // Naive Approach --> O(d) ...d = No of bits from the LSB to MSB
    // Traversing from the LSB to MSB
    public int countBits(int number)
    {
        int result = 0;

        while(number>0)
        {
            if (number % 2 == 1)
            {
                result++;
            }
            number = number / 2;
        }

        return result;
    }

    // Efficient Approach --> O(d) ...d = No of the Set bits
    // Brian Kerningam's Algorithm --> Traverse through only set bits
    public int countSetBits_Efficient(int number) {
        int result=0;

        while (number > 0)
        {
            number = number & (number - 1);
            result++;
        }

        return result;
    }

    // More Efficient Method --> O(1)
    // Lookup Table Solution --> Pre-compute counts for 8-bit numbers (0 to 255)
    int[] table = new int[256]; // Lookup table
    void initialise() // pre-processing
    {
        table[0] = 0;
        for (int i=1; i<256; i++){
            table[i] = table[i & (i-1)] + 1;
        }
    }
    int countSetBits_Table(int number){
        return table[number & 255]+
                table[(number >> 8) & 255]+
                table[(number >> 16) & 255]+
                table[(number >> 24)];
    }


    public static void main(String[] args) {
        Problem_CountSetBits problem = new Problem_CountSetBits();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Set bits in the Number are: "+problem.countBits(number)+" using Naive Approach");
        System.out.println("Set bits in the Number are: "+problem.countSetBits_Efficient(number)+" using Brian Kerningam's Algorithm");
        problem.initialise();
        System.out.println("Set bits in the Number are: "+problem.countSetBits_Table(number)+ " using the Lookup Table Solution");
    }
}
