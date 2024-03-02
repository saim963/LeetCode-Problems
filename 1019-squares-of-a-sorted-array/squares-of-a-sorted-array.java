class Solution {
    public int[] sortedSquares(int[] nums) {
        //follow up with dequeue
        //347
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}