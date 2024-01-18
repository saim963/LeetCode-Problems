class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int maxR = 0;
        int jumps = 0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, i+ nums[i]);
            if(maxR==i){
                maxR = max;
                jumps++;
                if(max >= nums.length-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
}