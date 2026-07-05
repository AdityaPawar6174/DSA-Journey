def factorialSum(arr):
    def sum_digits_until_single(num):
        """Keep summing digits until result is single digit"""
        while num >= 10:
            # Sum all digits
            digit_sum = 0
            while num > 0:
                digit_sum += num % 10
                num //= 10
            num = digit_sum
        return num
    
    def factorial(n):
        """Calculate factorial of n"""
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result
    
    def get_digits_set(num):
        """Get set of unique digits in a number"""
        digits_set = set()
        # Handle 0 separately
        if num == 0:
            digits_set.add('0')
        else:
            while num > 0:
                digits_set.add(str(num % 10))
                num //= 10
        return digits_set
    
    count_special = 0
    
    for num in arr:
        # Step 1: Calculate final sum (single digit)
        final_sum = sum_digits_until_single(num)
        
        # Step 2: Calculate factorial of final sum
        fact_val = factorial(final_sum)
        
        # Step 3: Get digits of original number
        original_digits = get_digits_set(num)
        
        # Step 4: Get digits of factorial value
        fact_digits = get_digits_set(fact_val)
        
        # Step 5: Check if all original digits are in factorial digits
        is_special = True
        for digit in original_digits:
            if digit not in fact_digits:
                is_special = False
                break
        
        if is_special:
            count_special += 1
    
    return count_special



# print(factorialSum([8, 310, 663, 845, 257, 561, 748, 735, 717]))  # Expected: 0
# # next test case
# print(factorialSum([9, 264, 653, 122, 780, 396, 727, 797, 419, 211]))  # Expected: 1

# next test 243
print(factorialSum([9, 833, 355, 243, 851, 360, 145, 214, 750, 112]))  # Expected: 1


