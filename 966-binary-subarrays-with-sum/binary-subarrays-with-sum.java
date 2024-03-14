class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return foo(goal, nums) - foo(goal-1, nums);
    }

    int foo(int goal, int[] nums){
        if(goal < 0)   return 0;

        int res =0;
        int l =0;
        int cur =0;
        for(int r=0; r<nums.length; r++){
            cur += nums[r];
            while(cur > goal){
                cur -= nums[l];
                l++;   
            }
            res += (r-l+1);
        }
        return res;
    }
}