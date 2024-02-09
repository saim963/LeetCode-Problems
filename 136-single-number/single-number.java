class Solution {
    public int singleNumber(int[] nums) {
        //XOR operator cancles out same numbers
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}