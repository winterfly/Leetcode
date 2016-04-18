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
            dp[0][j+1] = p.charAt(j) == '*' ? dp[0][j-1] : false;
        }
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (p.charAt(j) == '*') {
                    if (dp[i+1][j-1]) {
                        dp[i+1][j+1] = true;
                        continue;
                    }
                    char c = p.charAt(j-1);
                    dp[i+1][j+1] = false;
                    for (int k = 0; k <= i; k++) {
                        if (c != '.' && s.charAt(i-k) != c) {
                            break;
                        } else {
                            if (dp[i-k+1][j]) {
                                dp[i+1][j+1] = true;
                                break;
                            }
                        }
                    }
                } else if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n1][n2];
    }
}
