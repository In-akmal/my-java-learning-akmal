class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0; i<arr.length; i++){
            int curr =arr[i];
            int prev=i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
}