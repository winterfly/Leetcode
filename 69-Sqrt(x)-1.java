public class Solution {
    public int mySqrt(int x) {
        if (x<0) return 0;
        if (x<=1) return x;
        int left=1,right=x;
        while (left<right) {
            int mid=left+(right-left)/2;
            long mid2=(long)mid*(long)mid;
            if (mid2==(long)x) return mid;
            if (mid2<(long)x) 
                left=mid+1;
            else right=mid;
        }
        return right-1;
    }
}
