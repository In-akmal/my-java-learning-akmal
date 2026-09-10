class Solution {
    int missingNum(int arr[]) {
        int j=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==j){
                j++;
            }
            else{
                break;
            }
        }

        return j;
    }

}