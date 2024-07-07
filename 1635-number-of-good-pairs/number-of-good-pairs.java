class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum =0;
        int[] store = new int[101];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    store[nums[i]]++;
                }
            }
        }
        for(int e: store)   sum+=e;
        return sum;
    }
}