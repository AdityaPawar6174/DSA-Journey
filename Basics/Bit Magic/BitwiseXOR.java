public class BitwiseXOR {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int result = x ^ y; // Bitwise XOR operation
        // The result will be 5 (Binary: 0101)
        System.out.println(result);
        // Explanation:
        // The bitwise XOR operation compares each bit of the two numbers:
        // 0011
        // 0110
        // ----
        // 0101
        // The result is 5, as the first and third bits from the right are set
        // in one number but not both.
        System.out.println("The result of " + x + " ^ " + y + " is: " + result);
        // Output: The result of 3 ^ 6 is: 5
        System.out.println("Bitwise XOR operation completed successfully.");
    }
}
