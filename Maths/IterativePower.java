import java.util.Scanner;

public class IterativePower {

    // Binary Exponentiation using Iteration
    // Time Complexity: O(log n)
    public int power(int base, int exponent)
    {
        int result = 1;
        while (exponent > 0)
        {
            if (exponent % 2 != 0)
                result = result * base;

            base = base * base;
            exponent = exponent / 2;
        }
        return result;
    }

    

    public static void main(String[] args) {
        IterativePower iterativePower = new IterativePower();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exponentValue = sc.nextInt();

        int result = iterativePower.power(base, exponentValue);
        System.out.println("Result: " + result);

        sc.close();
    }
}
