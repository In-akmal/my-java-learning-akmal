class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words = s.trim().split("\\.");
        StringBuilder res = new StringBuilder();
        
        for(int i = words.length-1; i>=0; i--){
           
           