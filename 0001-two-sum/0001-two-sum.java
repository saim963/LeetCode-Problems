class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int t = 1; t < nums.length-i; t++) {
                if ((nums[i] + nums[i + t]) == target) {
                    result[0] = i;
                    result[1] = i + t;
                }
            }
        }
        return result;
    }
}