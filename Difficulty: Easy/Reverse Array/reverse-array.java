class Solution {
    public void reverseArray(int arr[]) {
        // Step 1: Initialize two pointers at the boundaries
        int left = 0;
        int right = arr.length - 1;

        // Step 2: Swap elements until pointers meet in the middle
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers closer
            left++;
            right--;
        }
    }
}
