class Solution {
    public int smallestSubstring(String s) {
        // code here
         int last0 = -1;
        int last1 = -1;
        int last2 = -1;
        
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Update the latest index for the current character
            if (ch == '0') last0 = i;
            else if (ch == '1') last1 = i;
            else if (ch == '2') last2 = i;
            
            // If we have seen all three characters at least once
            if (last0 != -1 && last1 != -1 && last2 != -1) {
                // Find the starting point of the current valid window
                int start = Math.min(last0, Math.min(last1, last2));
                int currentLength = i - start + 1;
                
                // Keep track of the absolute minimum length
                minLength = Math.min(minLength, currentLength);
            }
        }
        
        // If minLength was never updated, it means a valid window doesn't exist
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
};
