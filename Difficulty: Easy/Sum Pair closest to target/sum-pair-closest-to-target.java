import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        
        // Handle edge case where no pair can be formed
        if (arr == null || arr.length < 2) {
            return al; 
        }
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int maxAbsDiff = Integer.MIN_VALUE;   
        int resLeft = -1;
        int resRight = -1;
        
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            int currentDiff = Math.abs(target - currentSum);
            
            if (currentDiff < minDiff || 
               (currentDiff == minDiff && (arr[right] - arr[left]) > maxAbsDiff)) {
                
                minDiff = currentDiff;
                maxAbsDiff = arr[right] - arr[left];
                resLeft = arr[left];
                resRight = arr[right];
            }
            
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        al.add(resLeft);
        al.add(resRight);
        return al;
    }
}
