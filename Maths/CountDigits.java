import java.util.Scanner;

public class CountDigits {

    public int countDigits(int number){
        int count = 0;
        while (number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count its digits:");
        int num = scanner.nextInt();

        CountDigits main = new CountDigits();
        int digitCount = main.countDigits(num);
        System.out.println("The number of digits in "+num+" is: "+digitCount);
    }
}