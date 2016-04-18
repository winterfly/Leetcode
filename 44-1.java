public class Solution {
    public boolean isMatch(String s, String p) {
        
        int n1 = s.length();
        int n2 = p.length();
        
        boolean[][] dp = new boolean[n1+1][n2+1];
        
        dp[0][0] = true;
        for (int i = 0; i < n1; i++) {
            dp[i+1][0] = false;
        }
        for (int j = 0; j < n2; j++) {
            dp[0][j+1] = p.charAt(j) == '*' ? dp[0][j] : false;
        }
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (p.charAt(j) == '*') {
                    for (int k = -1; k <= i; k++) {
                        if (dp[k+1][j]) {
                            dp[i+1][j+1] = true;
                            break;
                        }
                    }
                } else if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                } else {
                    dp[i+1][j+1] = false;
                }
            }
        }
        
        return dp[n1][n2];
    }
}
