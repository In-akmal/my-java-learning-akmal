class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int[] arr1 =new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr1[j]=arr[i];
                j++;
            }
            
        }
        
        
        
        for(int i=0; i<arr1.length; i++){
            arr[i]=arr1[i];
        
        }
    }
}