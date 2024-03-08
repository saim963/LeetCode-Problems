class Solution {
    public int maxProfit(int[] prices) {
        //Brute Force  here time limit is exceeding
        // int max = 0;
        // for(int i=0; i<prices.length; i++){
        //     for(int j =i+1; j<prices.length; j++){
        //         if(prices[j]>prices[i]){
        //             int currPro = prices[j]-prices[i];
        //             max = Math.max(currPro,max);
        //         }
        //     }
        // }
        // return max;

        //This can still be optimied
        int[] nums = new int[prices.length-1];
        for(int i=1; i<prices.length; i++){
            nums[i-1] = prices[i]-prices[i-1]; 
        }
        //here difference array is created now kadane's algo
        //three step process sum+=arr[i], maxi(maxi,sum), if(sum<0)sum=0;
        int sum =0;
        int maxSum =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }
}