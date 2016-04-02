public class Solution {
    public double myPow(double x, int n) {
        if (n==Integer.MIN_VALUE) return 1/myPow(x,Integer.MAX_VALUE)/x;
        if (n<0) return 1/myPow(x,-n);
        if (n==0) return 1;
        if (n==1) return x;
        double temp=myPow(x,n/2);
        if (n%2==0) {
            return temp*temp;
        } else {
            return temp*temp*x;
        }
    }
}
