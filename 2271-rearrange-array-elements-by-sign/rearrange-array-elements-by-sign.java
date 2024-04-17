class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int n=1;
        int len = nums.length;
        int[] res = new int[len];
        for(int i=0; i<len; i++){
            if(nums[i]>0){
                res[p]=nums[i];
                p+=2;
            }else{
                res[n]=nums[i];
                n+=2;
            }
        }
        return res;
    }
}