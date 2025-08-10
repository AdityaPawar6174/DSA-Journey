public class BitwiseNOT {
    public static void main(String[] args) {
        int x = 3; // Binary: 0011
        int result = ~x; // Bitwise NOT operation
        // The result will be -4 (Binary: 1100 in two's complement)
        System.out.println(result);
        // Explanation:
        // The bitwise NOT operation inverts each bit of the number:
        // 0011
        // ----
        // 1100
        // In two's complement, this represents -4.
        System.out.println("The result of ~" + x + " is: " + result);
        // Output: The result of ~3 is: -4
        System.out.println("Bitwise NOT operation completed successfully.");
    }
}
