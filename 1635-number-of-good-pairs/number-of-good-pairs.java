class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum =0;
        int[] store = new int[101];
        for(int i: nums)    store[i]++;
        for(int i=0; i<101; i++){
            sum += (store[i] * (store[i]-1)/2);
        }
        return sum;
    }
}