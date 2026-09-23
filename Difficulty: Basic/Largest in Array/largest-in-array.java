class Solution {
    public static int largest(int[] arr) {
        // code here
        int ans=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}
