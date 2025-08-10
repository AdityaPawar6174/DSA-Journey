

public class BitwiseAND {
    public static void main(String[] args) {
        int x = 3; // Binary: 0011
        int y = 6; // Binary: 0110
        int result = x & y; // Bitwise AND operation
        // The result will be 2 (Binary: 0010)
        System.out.println(result);
        // Explanation:
        // The bitwise AND operation compares each bit of the two numbers:
        // 0011
        // 0110
        // ----
        // 0010
        // The result is 2, as only the second bit from the right is set in
        // both numbers.
        System.out.println("The result of " + x + " & " + y + " is: " + result);
        // Output: The result of 3 & 6 is: 2
        System.out.println("Bitwise AND operation completed successfully.");
    }
}