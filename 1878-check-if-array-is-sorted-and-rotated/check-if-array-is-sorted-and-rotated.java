class Solution {
    public boolean check(int[] nums){
        int inversions=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1])   inversions++;
        }
        if(nums[0]<nums[nums.length-1]) inversions++;
        return (inversions<=1);
    }
}