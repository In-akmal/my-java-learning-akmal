class Solution {
    public static String countSort(String s) {
        // Step 1: Create a frequency array for 26 lowercase characters
        int[] count = new int[26];

        // Step 2: Store the count of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++; // Map 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
        }

        // Step 3: Reconstruct the sorted string using a StringBuilder
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            // Append character (i + 'a') as many times as it appeared
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sortedString.toString();
    }
}
