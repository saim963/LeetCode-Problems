class Solution {
    public int singleNumber(int[] nums) {
        //XOR operator cancels out same numbers
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}