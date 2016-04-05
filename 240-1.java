public class Solution {
    private boolean search(int[][] matrix, int iStart, int iEnd, int jStart, int jEnd, int target) {
        if (iStart > iEnd || jStart > jEnd) return false;
        int iMid = iStart + (iEnd - iStart)/2;
        int jMid = jStart + (jEnd - jStart)/2;
        if (matrix[iMid][jMid] == target) return true;
        else if (matrix[iMid][jMid] > target) {
            return (search(matrix,iStart,iMid-1,jStart,jEnd,target) || search(matrix,iMid,iEnd,jStart,jMid-1,target));
        } else {
            return (search(matrix,iStart,iMid,jMid+1,jEnd,target) || search(matrix,iMid+1,iEnd,jStart,jEnd,target));
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int m = matrix.length;
        if (m == 0 || matrix[0] == null)  return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        
        return search(matrix,0,m-1,0,n-1,target);
    }
}
