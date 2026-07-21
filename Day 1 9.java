class Solution {
    public boolean isPalindrome(int x) {
        // Edge cases: 
        // 1. Negative numbers are not palindromes.
        // 2. Numbers ending in 0 (but not 0 itself) are not palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // TODO: Complete the loop to reverse the second half of the number
        // while (x > reversedHalf) {
        //     reversedHalf = (reversedHalf * 10) + (x % 10);
        //     x /= 10;
        // }

        // Compare the first half (x) and the reversed second half (reversedHalf)
        // Note: For odd-length numbers, divide reversedHalf by 10 to ignore the middle digit.
        return x == reversedHalf || x == reversedHalf / 10;
    }
}class Solution {
    public boolean isPalindrome(int x) {
        // Edge cases: 
        // 1. Negative numbers are not palindromes.
        // 2. Numbers ending in 0 (but not 0 itself) are not palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // TODO: Complete the loop to reverse the second half of the number
        // while (x > reversedHalf) {
        //     reversedHalf = (reversedHalf * 10) + (x % 10);
        //     x /= 10;
        // }

        // Compare the first half (x) and the reversed second half (reversedHalf)
        // Note: For odd-length numbers, divide reversedHalf by 10 to ignore the middle digit.
        return x == reversedHalf || x == reversedHalf / 10;
    }
