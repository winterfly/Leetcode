public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int m = matrix.length;
        if (m == 0)  return false;
        if (matrix[0] == null) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        
        int left = 0, right = m*n - 1;
        int mid, i, j;
        while (left <= right) {
            mid = left + (right - left)/2;
            i = mid/n;
            j = mid - n*i;
            if (matrix[i][j] == target)  return true;
            else if (matrix[i][j] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
        
    }
}
