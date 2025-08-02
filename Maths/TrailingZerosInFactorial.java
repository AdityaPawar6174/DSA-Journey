import java.math.BigInteger;
import java.util.Scanner;

public class TrailingZerosInFactorial {

    // Naive approach
    public int countZeros(int number)
    {
        int fact = 1;
        for (int i = 2; i <= number; i++)
        {
            fact = fact * i;
        }

        int result = 0;
        while (fact % 10 == 0)
        {
            result++;
            fact = fact / 10;
        }
        return result;
    }

    // Efficient approach
    public int countZerosEfficient(int number)
    {
        int result = 0;
        for (int i = 5; i<=number; i=i*5)
        {
            result = result + (number/i);
        }
        return result;
    }

    public static void main(String[] args) {
        TrailingZerosInFactorial tz = new TrailingZerosInFactorial();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count trailing zeros in its factorial: ");
        int number = sc.nextInt();

        int result = tz.countZeros(number);
        System.out.println("The number of trailing zeros in " + number + "! is: " +  result);

        int result2 = tz.countZerosEfficient(number);
        System.out.println("The number of trailing zeros in " + number + "! using efficient approach is: " +  result2);

        sc.close();

    }
}
