class Solution {
    public int maxSubArray(int[] nums) {
        //three step process sum+=arr[i], maxi(maxi,sum), if(sum<0)sum=0;
        int sum =0;
        int maxSum =nums[0];
        for(int num: nums){
            sum +=num;
            maxSum =Math.max(maxSum,sum);
            if(sum<0)   sum=0;
        }
        return maxSum;
    }
}