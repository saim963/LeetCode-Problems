class Solution {
    public int[] shuffle(int[] nums, int n) {
        int odd = 1;
        int even = 0;
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[even] = nums[i];
            even += 2;
            ans[odd] = nums[n+i];
            odd += 2 ;
        }
        return ans;
    }
}