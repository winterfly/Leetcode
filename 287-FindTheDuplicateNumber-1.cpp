class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n=nums.size();
        int left=1,right=n-1;
        while (left<right){
            int mid=left+(right-left)/2;
            int count=0;
            for (int i=0;i<n;i++) {
                if (nums[i]<=mid) count++;
            }
            if (count<=mid) {
                left=mid+1;
            } else {
                right=mid;
            }
        }
        return right;
    }
};
