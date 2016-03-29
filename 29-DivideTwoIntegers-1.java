public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0) return dividend>=0?Integer.MAX_VALUE:Integer.MIN_VALUE;
        if (dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        boolean flag=((dividend>0&&divisor>0) || (dividend<0&&divisor<0))?true:false;
        long dvd=Math.abs((long) dividend);
        long dvs=Math.abs((long) divisor);
        long dvs0=dvs;
        
        int val=1;
        while (dvs<<1<=dvd) {
            dvs=dvs<<1;
            val=val<<1;
        }
        
        int res=0;
        while (dvd>=dvs0) {
            if (dvs<=dvd) {
                dvd-=dvs;
                res+=val;
            }
            val=val>>1;
            dvs=dvs>>1;
        }
        
        return flag?res:-res;
        
    }
}
