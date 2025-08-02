import java.util.Scanner;

public class SieveOfEratosthenes {

    // Naive approach
    public void printPrimesNaives(int number)
    {
        for (int i=2; i<=number; i++)
        {
            CheckPrime checkPrime = new CheckPrime();
            if (checkPrime.isPrimeMoreEfficient(i))
                System.out.println(i);
        }
    }

    // Sieve of Eratosthenes approach
    public void printPrimesSieve(int number)
    {
        boolean[] isPrime = new boolean[number + 1];
        for (int i = 2; i <= number; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= number; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= number; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SieveOfEratosthenes se = new SieveOfEratosthenes();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check all of its prime numbers: ");
        int number = sc.nextInt();
        System.out.println("result via Naive approach");
        se.printPrimesNaives(number);

        System.out.println("result via Sieve of Eratosthenes approach");
        se.printPrimesSieve(number);
//        System.out.println("result via Sieve of Eratosthenes approach with more efficient prime checking");
//        CheckPrime checkPrime = new CheckPrime();
//        for (int i = 2; i <= number; i++) {
//            if (checkPrime.isPrimeMoreEfficient(i)) {
//                System.out.println(i);
//            }
//        }

        sc.close();
    }
}
