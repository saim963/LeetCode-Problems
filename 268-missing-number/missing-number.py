class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum = n*(n+1)//2
        sum_x = 0
        for num in nums:
            sum_x += num
        return (sum-sum_x)