# # def factorialSum(arr):
# #     import math
    
# #     def final_digit_sum(n):
# #         # Keep summing digits until single digit remains
# #         while n > 9:
# #             s = 0
# #             while n > 0:
# #                 s += n % 10
# #                 n //= 10
# #             n = s
# #         return n
    
# #     special_count = 0
    
# #     for num in arr:
# #         # Step 1: final sum
# #         fs = final_digit_sum(num)
        
# #         # Step 2: factorial of final sum
# #         fact_value = math.factorial(fs)
        
# #         # Convert factorial to a set of digits
# #         fact_digits = set(str(fact_value))
        
# #         # Step 3: check digits of num
# #         num_digits = set(str(num))
        
# #         # Check if any digit of num exists in factorial digits
# #         if num_digits & fact_digits:
# #             special_count += 1
    
# #     return special_count

# # # Example usage:
# # print(factorialSum([12, 23, 34, 45]))  


# def factorialSum(arr):
#     import math
    
#     def final_digit_sum(n: int) -> int:
#         # Repeatedly sum digits until a single digit remains
#         while n > 9:
#             s = 0
#             while n > 0:
#                 s += n % 10
#                 n //= 10
#             n = s
#         return n
    
#     special_count = 0
    
#     for num in arr:
#         # Step 1: compute final sum of digits
#         fs = final_digit_sum(num)
        
#         # Step 2: factorial of the final sum
#         fact_value = math.factorial(fs)
        
#         # Digits present in factorial-sum
#         fact_digits = set(str(fact_value))
        
#         # Digits present in the original number
#         num_digits = set(str(num))
        
#         # Step 3: every digit of num must be in factorial-sum
#         if num_digits.issubset(fact_digits):
#             special_count += 1
    
#     return special_count

# # Example usage:
# print(factorialSum([9,833,355,243,851,360,145,214,750,112])) # 


def factorialSum(arr):
    """
    Count special numbers in the array.
    A special number is one where each of its digits appears 
    somewhere in its factorial-sum.
    """
    
    def get_factorial(n):
        """Calculate factorial of n"""
        if n <= 1:
            return 1
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result
    
    def calculate_factorial_sum(num):
        """
        Calculate the factorial-sum by repeatedly summing 
        digit factorials until single digit
        """
        current = num
        
        while current >= 10:
            # Sum the factorials of each digit
            digit_sum = 0
            temp = current
            while temp > 0:
                digit = temp % 10
                digit_sum += get_factorial(digit)
                temp //= 10
            current = digit_sum
        
        return current
    
    def get_all_factorial_sums(num):
        """
        Get all intermediate factorial-sum values during the reduction process
        """
        sums = set()
        current = num
        
        while current >= 10:
            # Sum the factorials of each digit
            digit_sum = 0
            temp = current
            while temp > 0:
                digit = temp % 10
                digit_sum += get_factorial(digit)
                temp //= 10
            
            sums.add(digit_sum)
            current = digit_sum
        
        # Add the final single digit result
        sums.add(current)
        return sums
    
    def is_special_number(num):
        """
        Check if num is a special number.
        Each digit of num must appear in at least one of the factorial-sum values.
        """
        # Get digits of the number
        digits_in_num = set(str(num))
        
        # Get all factorial-sum values (intermediate and final)
        factorial_sums = get_all_factorial_sums(num)
        
        # Combine all digits from all factorial-sum values
        all_factorial_digits = set()
        for fs in factorial_sums:
            all_factorial_digits.update(str(fs))
        
        # Check if every digit of num appears in the factorial-sum digits
        for digit in digits_in_num:
            if digit not in all_factorial_digits:
                return False
        
        return True
    
    # Count special numbers in the array
    count = 0
    for num in arr:
        if is_special_number(num):
            count += 1
    
    return count


# Test with the provided examples
if __name__ == "__main__":
    # # Test case 1: No special numbers
    # test1 = [8, 310, 663, 845, 257, 561, 748, 735, 717]
    # print(f"Test 1: {factorialSum(test1)}")  # Expected: 0
    
    # Test case 2: One special number (122)
    test2 = [9, 264, 653, 122, 780, 396, 727, 797, 419, 211]
    print(f"Test 2: {factorialSum(test2)}")  # Expected: 1
    
    # # Test case 3: One special number (360)
    # test3 = [9, 833, 355, 243, 851, 360, 145, 214, 750, 112]
    # print(f"Test 3: {factorialSum(test3)}")  # Expected: 1
    
    # # Additional test cases
    # # Single digit numbers are always special (digit appears in itself)
    # test4 = [1, 2, 3, 4, 5]
    # print(f"Test 4 (single digits): {factorialSum(test4)}")  # Expected: 5
    
    # # Testing 8795 from the problem description
    # test5 = [8795]
    # print(f"Test 5 (8795): {factorialSum(test5)}")  # Expected: 0 or 1 depending on interpretation