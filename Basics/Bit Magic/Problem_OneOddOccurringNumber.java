// find the number that occurs only once / Odd times in an array where every other number occurs twice / Evenly
// (does not work for more numbers with odd occurrences...)

// i/p: arr = {4,3,4,4,4,5,5};  o/p: 3
// i/p: arr = {8,7,7,8,8};      o/p: 8

import java.util.Scanner;

public class Problem_OneOddOccurringNumber {

    // Naive Approach --> O(n^2)
    // count occurrences of every number
    public int findOdd(int[] arr, int size) {
        for (int i=0; i<size; i++){
            int count = 0;
            for(int j=0; j<size; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    // Efficient Solution --> O(n)
    // XOR Approach (^) --> X^X = 0;    X^0=X;
    // if number - odd -> (wil get X);  if number - Even -> (will get 0)
    public int findOddNumber(int[] arr, int size) {
        int result = arr[0];
        for(int i=1; i<size; i++){
            result = result ^ arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Problem_OneOddOccurringNumber obj = new Problem_OneOddOccurringNumber();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Odd Occurring Number is (using Naive): "+obj.findOdd(arr, size));
        System.out.println("Odd Occurring Number is (using XOR operation): "+obj.findOddNumber(arr, size));
    }
}
