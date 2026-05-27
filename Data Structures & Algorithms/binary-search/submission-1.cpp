class Solution {
public:
    int helper(int l,int r,int target,vector<int>&nums){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l++;
            }
            else {
                r--;
            }
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        return helper(0,nums.size()-1,target,nums);
    }
};
