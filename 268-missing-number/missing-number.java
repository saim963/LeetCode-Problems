class Solution {
    public int missingNumber(int[] nums) {
        int sumArr = 0;
        int sumN = nums.length*(nums.length+1)/2;
        for(int num: nums){
            sumArr+=num;
        }
        return sumN-sumArr;
    }
}