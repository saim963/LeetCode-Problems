class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l,cur = 0,0
        min_len = float('inf')
        for r in range(len(nums)):
            cur += nums[r]
            while cur >= target:
                min_len = min(min_len, r-l+1)
                cur -= nums[l]
                l += 1
        return min_len if min_len < float('inf') else 0