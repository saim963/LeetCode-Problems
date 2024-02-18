class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int t =i+1; t < nums.length; t++) {
                if ((nums[i] + nums[t]) == target) {
                    result[0] = i;
                    result[1] = t;
                    return result;
                }
            }
        }
        return new int[]{-1, -1};
    }
}