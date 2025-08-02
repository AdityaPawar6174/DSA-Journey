import java.util.Scanner;

public class CheckPrime {

    // Naive approach
    public boolean isPrimeNative(int number)
    {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    // Efficient approach
    // This method checks divisibility only up to the square root of the number
    // and skips even numbers after checking 2.
    public boolean isPrimeEfficient(int number)
    {
        if (number <= 1)
            return false;

        for (int i=2; i*i <= number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // More efficient approach
    public boolean isPrimeMoreEfficient(int number)
    {
        if (number <= 1)
            return false;
        if (number == 2 || number == 3)
            return true;
        if (number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i*i<= number; i=i+6)
        {
            if (number % i == 0 || number % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPrime checkPrime = new CheckPrime();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        boolean result = checkPrime.isPrimeNative(number);

        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        boolean result2 = checkPrime.isPrimeEfficient(number);
        if (result2) {
            System.out.println(number + " is a prime number (checked using efficient method).");
        } else {
            System.out.println(number + " is not a prime number (checked using efficient method).");
        }

        boolean result3 = checkPrime.isPrimeMoreEfficient(number);
        if (result3) {
            System.out.println(number + " is a prime number (checked using more efficient method).");
        } else {
            System.out.println(number + " is not a prime number (checked using more efficient method).");
        }

        sc.close();
    }
}
