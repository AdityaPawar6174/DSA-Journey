import java.util.Scanner;

// Least Common Multiple (LCM)
public class LCM {

    // Naive approach
    public int lcmNaive(int a, int b) {
        int result = Math.max(a, b);

        while (true)
        {
            if (result % a == 0 && result % b == 0)
                return result;
            result++;
        }
    }

    // Efficient approach using GCD
    public int lcmEfficient(int a, int b) {
        GCD gcd = new GCD();
        return (a * b) / gcd.gcdOptimized(a, b);
    }

    public static void main(String[] args) {

        LCM lcm = new LCM();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate their LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = lcm.lcmNaive(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + result);

        int result2 = lcm.lcmEfficient(a, b);
        System.out.println("The LCM of " + a + " and " + b + " using efficient approach is: " + result2);
        sc.close();
    }
}
