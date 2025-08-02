import java.util.Scanner;

public class PrimeFactors {

    // Naive approach
    public void primeFactorsNaive(int number)
    {
        CheckPrime checkPrime = new CheckPrime();
        System.out.print("Prime factors of " + number + " are: \n");

        for (int i=2; i<number; i++)
        {
            if (checkPrime.isPrimeMoreEfficient(i))
            {
                int x = i;
                while (number % x == 0)
                {
                    System.out.println(i);
                    x = x * i;
                }
            }
        }
    }

    // Efficient approach --> Divisors always appear in pairs
    public void primeFactorsEfficient(int number)
    {
        if (number <= 1)
            return;

        for (int i = 2; i*i<=number; i++)
        {
            while (number % i == 0)
            {
                System.out.println(i);
                number = number / i;
            }
        }
        if (number > 1)
            System.out.println(number); // If number is prime and greater than 1, print it
    }

    // More efficient approach using trial division
    public void primeFactorsMoreEfficient(int number)
    {
        if (number <= 1)
            return;

        while (number % 2 == 0) {
            System.out.println(2);
            number /= 2;
        }
        while (number % 3 == 0) {
            System.out.println(3);
            number /= 3;
        }
        for (int i = 5; i * i <= number; i += 6)
        {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
            while (number % (i + 2) == 0) {
                System.out.println(i + 2);
                number /= (i + 2);
            }
        }
        if (number > 3) {
            System.out.println(number); // If number is prime and greater than 3, print it
        }
    }

    public static void main(String[] args) {
        PrimeFactors  primeFactors = new PrimeFactors();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors: ");
        int number = sc.nextInt();
        primeFactors.primeFactorsNaive(number);

        System.out.println("Using efficient approach:");
        primeFactors.primeFactorsEfficient(number);
        System.out.println("Done!");

        System.out.println("Using more efficient approach:");
        primeFactors.primeFactorsMoreEfficient(number);
        System.out.println("Done!");
        sc.close();

    }
}
