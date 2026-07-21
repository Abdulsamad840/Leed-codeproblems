class Solution {
    public int reverse(int x) {
        long reversed = 0;  // Use long to prevent overflow during calculation
        
        while (x != 0) {
            // Extract digit
            int digit = x % 10;
            
            // Build reversed number
            reversed = reversed * 10 + digit;
            
            // Remove processed digit
            x /= 10;
        }
        
        // Check bounds
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
}
