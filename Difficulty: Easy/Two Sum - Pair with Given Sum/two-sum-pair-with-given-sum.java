class Solution {
    public boolean twoSum(int arr[], int target) {
        // code here
       Set<Integer> seen = new HashSet<>(); 
        
        for (int i = 0; i < arr.length; i++) { 
            int need = target - arr[i]; 
            
            if (seen.contains(need)) { 
                return true; 
            } 
            seen.add(arr[i]); 
        } 
        return false; 
    }
}