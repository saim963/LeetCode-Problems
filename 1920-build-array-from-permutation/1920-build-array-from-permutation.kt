class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size) 
        for(i in 0 until nums.size){
            ans[i] = nums[nums[i]]
        }
        return ans
    }
}