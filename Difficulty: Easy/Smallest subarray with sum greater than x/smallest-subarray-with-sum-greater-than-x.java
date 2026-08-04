class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int currentSum = 0;
        int minLength = n + 1; // Initialize with an impossible value
        int left = 0;

        for (int right = 0; right < n; right++) {
            // Expand the window
            currentSum += arr[right];

            // Shrink the window as long as the condition is met
            while (currentSum > x) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];
                left++;
            }
        }

        // If minLength was never updated, no valid subarray exists
        return (minLength == n + 1) ? 0 : minLength;
    }
}
