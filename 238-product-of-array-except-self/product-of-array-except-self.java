class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre =1;
        int pos =1;
        int[] result =new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = pre;
            pre *= nums[i];
        }
        for(int j=nums.length-1; j>=0; j--){
            result[j] *= pos;
            pos *= nums[j];
        }
        return result;
    }
}