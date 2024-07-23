class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount =0;
        for(int e: nums){
            if(e==1)    count+=1;
            else count=0;
            maxCount = Math.max(maxCount,count);
        }
        return  maxCount;
    }
}