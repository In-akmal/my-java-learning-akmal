import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Base check for empty matrix
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return result;
        }
        
        int n = mat.length; // Since it's an n * n square matrix
        int totalDiagonals = 2 * (n - 1);
        
        // Loop through each diagonal sum (row + col) from 0 to 2*(n-1)
        for (int sum = 0; sum <= totalDiagonals; sum++) {
            
            // Try every possible row index
            for (int r = 0; r < n; r++) {
                int c = sum - r; // Because r + c = sum
                
                // Keep column index within valid matrix boundaries
                if (c >= 0 && c < n) {
                    result.add(mat[r][c]);
                }
            }
        }
        
        return result;
    }
}
