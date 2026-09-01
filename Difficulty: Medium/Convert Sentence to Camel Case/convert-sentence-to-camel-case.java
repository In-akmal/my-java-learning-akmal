class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        String[] words = s.split("\\s+");
        
        StringBuilder result = new StringBuilder(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            
            result.append(Character.toUpperCase(words[i].charAt(0)));
            
            result.append(words[i].substring(1));
            
        }
        
        return result.toString();
       
    }
}