class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE; 
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right]; // Add next element

            // Keep shrinking from the left while the sum is greater than x
            while (currentSum > x) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];
                left++;
            }
        }

        // If minLength was never changed, return 0. Otherwise, return minLength.
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}
