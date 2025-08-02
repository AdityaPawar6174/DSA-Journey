import java.util.Scanner;

public class Exponent {

    // Naive Approach --> O(n)
    public int power(int base, int exponent)
    {
        int result = 1;
        for (int i=0; i<exponent; i++)
        {
            result = result * base;
        }
        return result;
    }

    // Efficient Approach --> O(log n)
    public int powerEfficient(int base, int exponent)
    {
        if (exponent == 0) return 1;

        int temp = powerEfficient(base, exponent/2);
        temp = temp * temp;

        if (exponent % 2 == 0)
            return temp;
        else
            return temp * base;
    }

    public static void main(String[] args) {
        Exponent exponent = new Exponent();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exponentValue = sc.nextInt();

        int result = exponent.power(base, exponentValue);
        System.out.println("Result: " + result);

        int resultEfficient = exponent.powerEfficient(base, exponentValue);
        System.out.println("Result via efficient approach: " + resultEfficient);


        sc.close();

    }
}
