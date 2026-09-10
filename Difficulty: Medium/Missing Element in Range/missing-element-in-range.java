class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        for(int i=low; i<=high; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}