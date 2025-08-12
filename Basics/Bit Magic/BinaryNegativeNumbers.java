// Negative Numbers are represented in the 2's complement form in Binary
// Range of Nums --- [-2^(n-1), 2^(n-1)-1] ...(n is number of bits)

// 2's Complement --> 1. Invert all bits (1's complement) 2. Add 1 to the result
// Direct Formula --> 2^n - x

// example ----->
// Lets Take, n = 4 (4 bits)
// range of numbers --> [-2^(4-1), 2^(4-1)-1] = [-8, 7]

// By Method =>
// Binary Representation of x = -3
// 3 : 0011
// 2's complement of 3 = (1's complement + 1) = 1100 + 1 = 1101

// Direct Formula =>
// 2^4 - 3 = 16 - 3 = 13

public class BinaryNegativeNumbers {


}
