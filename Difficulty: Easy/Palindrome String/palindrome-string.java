class Solution {
    boolean isPalindrome(String s) {
        // code here
        int firstLetter = 0;
        int lastLetter = s.length() - 1; 
      
        while(firstLetter < lastLetter){
            if(s.charAt(firstLetter) != s.charAt(lastLetter)){
                return false;
                
           }
           firstLetter++;
           lastLetter--;
        }
        return true;
    }
}