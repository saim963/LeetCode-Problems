class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int maxR = 0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, i+nums[i]);
            if(maxR==i){
                maxR = max;
                if(maxR>=nums.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}