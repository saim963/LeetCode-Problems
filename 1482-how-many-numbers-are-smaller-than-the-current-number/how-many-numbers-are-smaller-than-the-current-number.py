class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count = 0
        res = []
        for i in nums:
            for j in nums:
                if j<i:
                    count += 1
            res.append(count)
            count = 0
        return res