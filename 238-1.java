public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[n-1]=1;
        for (int i=n-2;i>=0;i--) {
            res[i]=res[i+1]*nums[i+1];
        }
        int product=1;
        for (int i=0;i<n;i++) {
            res[i]*=product;
            product*=nums[i];
        }
        return res;
    }
}
