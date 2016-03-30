public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack==null||needle==null) return -1;
        int n=haystack.length();
        int m=needle.length();
        if (m>n) return -1;
        for (int i=0;i<=n-m;i++) {
            boolean flag=true;
            for (int j=i;j<i+m;j++) {
                if (haystack.charAt(j)!=needle.charAt(j-i)) {
                    flag=false;
                    break;
                }
            }
            if (flag) return i;
        }
        return -1;
        
    }
}
