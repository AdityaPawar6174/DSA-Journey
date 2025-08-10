public class BitwiseOR {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int result = x | y; // Bitwise OR operation
        // The result will be 7 (Binary: 0111)
        System.out.println(result);
        // Explanation:
        // The bitwise OR operation compares each bit of the two numbers:
        // 0011
        // 0110
        // ----
        // 0111
        // The result is 7, as the first, second, and third bits from the
        // right are set in at least one of the numbers.
        System.out.println("The result of " + x + " | " + y + " is: " + result);
        // Output: The result of 3 | 6 is: 7
        System.out.println("Bitwise OR operation completed successfully.");
    }
}
