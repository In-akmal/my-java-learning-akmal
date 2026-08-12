class Solution {
    boolean search(String txt, String pat) {
        int patLen = pat.length();
        int txtLen = txt.length();
        
        // Base case: pattern cannot be a substring if it is longer than txt
        if (patLen > txtLen) return false;
        
        // Frequency counts for pat and the current window in txt
        int[] patCounts = new int[26];
        int[] txtCounts = new int[26];
        
        // Initialize counts for the first window
        for (int i = 0; i < patLen; i++) {
            patCounts[pat.charAt(i) - 'a']++;
            txtCounts[txt.charAt(i) - 'a']++;
        }
        
        // Check if the initial window is a match
        if (matches(patCounts, txtCounts)) return true;
        
        // Slide the window across txt
        for (int i = patLen; i < txtLen; i++) {
            // Add the new character entering the window
            txtCounts[txt.charAt(i) - 'a']++;
            // Remove the old character leaving the window
            txtCounts[txt.charAt(i - patLen) - 'a']--;
            
            // Check if current window matches pat
            if (matches(patCounts, txtCounts)) return true;
        }
        
        return false;
    }
    
    // Helper method to compare character frequencies
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
