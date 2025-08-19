package Recursion;

// Check if a string is a palindrome using recursion

// i/p: str = "madam";      o/p: true
// i/p: str = "hello";      o/p: false

public class Problem_CheckPalindrome {

    boolean isPalindrome(String str, int start, int end){
        if (start >= end)
            return true;

        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        Problem_CheckPalindrome obj = new Problem_CheckPalindrome();
        String str1 = "madam"; // Change this value to test with different inputs
        String str2 = "hello"; // Change this value to test with different inputs

        System.out.println("Is \"" + str1 + "\" a palindrome? " + obj.isPalindrome(str1, 0, str1.length() - 1));
        System.out.println("Is \"" + str2 + "\" a palindrome? " + obj.isPalindrome(str2, 0, str2.length() - 1));
        // Output will be:
        // Is "madam" a palindrome? true
        // Is "hello" a palindrome? false
    }
}
 