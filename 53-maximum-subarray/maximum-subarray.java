class Solution {
    public int maxSubArray(int[] nums) {
    //three step process sum+=arr[i], maxi(maxi,sum), if(sum<0)sum=0;
        int currSum =0;
        int maxSum =nums[0];
        for(int el: nums){
            currSum += el;
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0)   currSum =0;
        }
        return maxSum;
    }
}