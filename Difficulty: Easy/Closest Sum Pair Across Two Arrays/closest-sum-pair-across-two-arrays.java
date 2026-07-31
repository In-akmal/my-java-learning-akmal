class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int n = arr1.length;
        int m = arr2.length;
        
        // Pointers for both arrays
        int left = 0;       // Starts at the beginning of arr1
        int right = m - 1;  // Starts at the end of arr2
        
        int minDiff = Integer.MAX_VALUE;
        int res1 = -1;
        int res2 = -1;
        
        while (left < n && right >= 0) {
            int currentSum = arr1[left] + arr2[right];
            int currentDiff = Math.abs(x - currentSum);
            
            // If we find a pair with a smaller absolute difference, update results
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                res1 = arr1[left];
                res2 = arr2[right];
            }
            
            // Move pointers dynamically
            if (currentSum < x) {
                left++;    // Increase sum by moving right in arr1
            } else {
                right--;   // Decrease sum by moving left in arr2
            }
        }
        
        res.add(res1);
        res.add(res2);
        return res;
        
    }
}