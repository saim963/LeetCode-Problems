class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumArr = 0;
        int sumN = n*(n+1)/2;
        for(int num: nums){
            sumArr+=num;
        }
        return sumN-sumArr;
    }
}