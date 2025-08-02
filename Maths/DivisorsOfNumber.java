import java.util.Scanner;

public class DivisorsOfNumber {

    // Naive Approach
    public void printDivisorsNaive(int number)
    {
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
                System.out.println(i);
        }
    }

    // Efficient Approach
    public void printDivisors2(int number)
    {
        for (int i=1; i*i<=number; i++)
        {
            if (number % i == 0)
            {
                System.out.println(i);
                if (i != number / i)
                    System.out.println(number / i);
            }
        }
    }

    public void printDivisors3(int number)
    {
        int i;
        for (i=1; i*i<number; i++)
        {
            if (number%i==0)
                System.out.println(i);
        }
        for (;i>=1;i--)
        {
            if (number%i==0)
                System.out.println(number/i);
        }
    }


    public static void main(String[] args)
    {
        DivisorsOfNumber divisorsOfNumber = new DivisorsOfNumber();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check all of its divisors: ");
        int number = sc.nextInt();

        System.out.println("result via Naive approach");
        divisorsOfNumber.printDivisorsNaive(number);

        System.out.println("result via Efficient Approach");
        divisorsOfNumber.printDivisors2(number);

        System.out.println("result by more efficient approach");
        divisorsOfNumber.printDivisors3(number);

        sc.close();
    }
}
