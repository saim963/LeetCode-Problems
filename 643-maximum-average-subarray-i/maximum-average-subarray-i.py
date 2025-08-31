class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        curr = best = sum(nums[:k])
        for r in range(k,len(nums)):
            curr = curr + nums[r] - nums[r-k]
            best = max(best,curr)

        return best/k