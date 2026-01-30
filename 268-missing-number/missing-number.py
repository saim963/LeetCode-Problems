class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sum_n = len(nums)*(len(nums)+1)//2
        return sum_n - sum(nums)