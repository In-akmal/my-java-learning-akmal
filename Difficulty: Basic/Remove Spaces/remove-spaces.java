class Solution {
    public String removeSpaces(String s) {
        // code here
        String str = s.replaceAll("\\s", "");
        return str;
    }
}