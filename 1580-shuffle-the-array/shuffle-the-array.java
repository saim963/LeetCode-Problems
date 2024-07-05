class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;
        int k = 1;
        int[] ans = new int[2*n];
        for(int i=0; i<2*n; i+=2){
            ans[i] = nums[j];
            ans[k] = nums[n+j];
            j++;
            k+=2;
        }
        return ans;
    }
}