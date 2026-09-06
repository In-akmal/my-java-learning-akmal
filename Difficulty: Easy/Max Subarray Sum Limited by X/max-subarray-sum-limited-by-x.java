class Solution {
    public int maxSum(int[] arr, int x) {
        int n = arr.length;
        int res = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            // Expand the window by adding the current element
            currentSum += arr[end];

            // Shrink the window from the left if the sum exceeds x
            while (currentSum > x && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Update the maximum valid subarray sum found so far
            res = Math.max(res, currentSum);
        }

        return res;
    }
}
