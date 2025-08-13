// Checks the two numbers which are occurring ODD in and array---test are evenly occurring

// i/p: arr[] = {3,4,3,4,5,4,4,6,7,7};  o/p: 5 6
// i/p: arr[] = {1,3,2,3,3,1};          o/p: 3 2

import java.util.Scanner;

public class Problem_TwoOddOccurringNumbers {

    // Naive Approach --> O(n^2)
    public void findOdd(int[] arr, int size){

        for (int i=0; i<size; i++){
            int count=0;
            for (int j=0; j<size; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                System.out.println(arr[i]);
        }
    }

    // Efficient Solution --> O(n)
    // !. Firstly perform XOR   2. A Set Bit of result from XOR...(perform calculation of the det bits by XOr with other elements present in the array)
    void oddAppearing(int[] arr, int size){
        int x = arr[0];
        for (int i=1; i<size; i++){
            x = x ^  arr[i];
        }
        int k = (x & (~(x-1)));
        int result1 = 0, result2 = 0;
        for (int i=0; i<size; i++){
            if ((arr[i] & k) != 0){
                result1 ^= arr[i];
            }
            else {
                result2 ^= arr[i];
            }
        }
        System.out.println(result1);
        System.out.println(result2);
    }


    public static void main(String[] args) {
        Problem_TwoOddOccurringNumbers obj2 = new Problem_TwoOddOccurringNumbers();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Solution using Naive approach: ");
        obj2.findOdd(arr, size);
        System.out.println("Solution using efficient approach: ");
        obj2.oddAppearing(arr, size);
    }

}
