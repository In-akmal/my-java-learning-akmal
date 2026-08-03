class Solution {
    static int mindGame(int k) {
        // code here
        int num =k+k;
        int num1 = num+k;
        int num2 = num1/2;
        int num3=num2-k;
        return num3;
    }
};