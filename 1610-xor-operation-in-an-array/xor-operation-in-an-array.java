class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int value =start;
        for(int i=1; i<n; i++){
            nums[i]=start+2*i;
            value = value^nums[i];
        }
        return value;
    }
}