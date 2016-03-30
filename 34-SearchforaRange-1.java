public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n;
        int[] res=new int[2];
        
        //min
        while (left<right) {
            int mid=left+(right-left)/2;
            if (nums[mid]<target) left=mid+1;
            else right=mid;
        }
        res[0]=right;
        
        //max
        left=0;
        right=n;
        while (left<right) {
            int mid=left+(right-left)/2;
            if (nums[mid]<=target) left=mid+1;
            else right=mid;
        }
        res[1]=right-1;
        
        if (res[1]<res[0]) {
            res[0]=-1;
            res[1]=-1;
        }
        
        return res;
        
    }
}
