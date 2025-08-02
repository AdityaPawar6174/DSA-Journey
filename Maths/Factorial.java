import java.util.Scanner;

public class Factorial {

    // Brute force approach
    public int factorialBruteForce(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Number must be positive.");
        }

        int result = 1;
        for (int i = 2; i <= number; i++)
        {
            result = result * i;
        }

        return result;
    }

    // Recursive approach
    public int factorialRecursive(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Number must be positive.");
        }
        if (number == 1 || number == 0)
        {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        int result1 = factorial.factorialBruteForce(number);
        System.out.println("The factorial of " + number + " using Brute force approach is: " + result1);
        System.out.println();
        int result2 = factorial.factorialRecursive(number);
        System.out.println("The factorial of " + number + " using Recursive approach is: " + result2);

        sc.close();

    }
}
