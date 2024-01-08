class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        // int[] ans = nums.clone();
        for(int i=0; i<n; i++){
            ans[i] =nums[i];
            ans[n+i] =nums[i]; 
        }
        return ans;
    }
}