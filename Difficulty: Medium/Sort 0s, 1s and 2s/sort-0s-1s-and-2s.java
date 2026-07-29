class Solution {
    public void sort012(int[] arr) {
        // code here
        // int [] arr1 =new int[arr.length];
        
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
        }
        int k = arr.length-1;
        for(int i=arr.length-1; i>=j; i--){
            if(arr[i]==2){
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
    }
}