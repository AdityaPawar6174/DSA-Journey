public class BitwiseLeftShift {
    public static void main(String[] args) {
        int x = 3; // Binary: 0011
        System.out.println(x << 1); // Bitwise left shift operation
        // The result will be 6 (Binary: 0110)
        System.out.println(x << 2); // Bitwise left shift operation
        // The result will be 12 (Binary: 1100)

        int y = 4; // Binary: 0100
        System.out.println(x << y); // Bitwise left shift operation
        // The result will be 48 (Binary: 110000)

        // Explanation:
        // The bitwise left shift operation shifts the bits of the number to the left by the
        // specified number of positions, filling the rightmost bits with zeros.
        // For example:
        // 0011 (3 in binary)
        // << 1 (shift left by 1 position)
        // ----
        // 0110 (6 in binary)
    }
}
