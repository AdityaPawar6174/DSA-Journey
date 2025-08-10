public class BitwiseRightShift_unsigned {
    public static void main(String[] args) {
        int x = -2; // Binary: 11111111111111111111111111111110 (32-bit signed integer representation)

        // Negative represented by - (2^32 - 2) in two's complement

        System.out.println(x >>> 1); // Unsigned right shift by 1
        // The result will be 1073741823 (Binary: 00111111111111111111111111111111)
        // Explanation:
        // The unsigned right shift operation shifts bits to the right and fills
        // the leftmost bits with zeros, regardless of the sign of the number.
        // For example:
        // 11111111111111111111111111111110 (x = -2)
        // >>> 1 (unsigned right shift by 1 position)
        // ----
        // 00111111111111111111111111111111 (result = 1073741823)
        System.out.println("The result of " + x + " >>> 1 is: " + (x >>> 1));
        // Output: The result of -2 >>> 1 is: 1073741823

//        System.out.println(x >>> 4);
    }
}
