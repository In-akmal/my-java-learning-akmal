
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            int need = target-arr[i];
            
            if(h.contains(need)){
                return true;
            }
            h.add(arr[i]);
        }
        return false;   
    }
}
