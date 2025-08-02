import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;

        while (temp != 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }

        return (reverse == number);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int num = scanner.nextInt();

        boolean result = palindrome.isPalindrome(num);
        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        scanner.close();
    }
}
