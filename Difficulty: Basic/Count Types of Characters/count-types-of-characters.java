class Sol {
    int[] count(String s) {
        // your code here
        int[] res=new int[4];
        for(char ch: s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                res[0]++;
            } else if (Character.isLowerCase(ch)) {
                res[1]++;
            } else if (Character.isDigit(ch)) {
                res[2]++;
            } else {
                res[3]++;
            }
        }
        return res;
    }
}