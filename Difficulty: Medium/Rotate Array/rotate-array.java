
class Solution {
     static void rotateArr(int arr[], int d) {
         int n = arr.length;
         Queue<Integer> q = new LinkedList<>();
         d = d%n;

         for(int i=d;i<n;i++){
             q.add(arr[i]);
         }

         for(int i=0;i<d;i++){
             q.add(arr[i]);
         }

         for(int i = 0; i < n; i++){
             int removeEle = q.remove();
             arr[i] = removeEle;
         }
     }
 }

