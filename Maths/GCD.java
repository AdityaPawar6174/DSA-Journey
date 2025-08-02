import java.util.Scanner;

// Greatest Common Divisor (GCD) calculation
public class GCD {

    // Naive approach
    public int gcdNaive(int a, int b)
    {
        int result = Math.min(a, b);
        while (result > 0)
        {
            if (a % result == 0 && b % result == 0)
            {
                break;
            }
            result--;
        }
        return result;
    }

    // Euclidean algorithm
    public int gcdEuclidean(int a, int b)
    {
        while(a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    // Optimized Euclidean algorithm
    public int gcdOptimized(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcdOptimized(b, a % b);
    }



    public static void main(String[] args) {
        GCD gcd = new GCD();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = gcd.gcdNaive(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);

        int result2 = gcd.gcdEuclidean(a, b);
        System.out.println("The GCD of " + a + " and " + b + " using Euclidean algorithm is: " + result2);

        int result3 = gcd.gcdOptimized(a, b);
        System.out.println("The GCD of " + a + " and " + b + " using Optimized Euclidean algorithm is: " + result3);

        sc.close();
    }
}
