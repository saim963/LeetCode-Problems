class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN=n*(n+1)/2;
        int sumI = 0;
        for(int num: nums)      
            sumI += num;
        return sumN-sumI;
    }
}