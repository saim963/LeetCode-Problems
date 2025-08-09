class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_dic = {}
        for i,num in enumerate(nums):
            diff = target - num
            if diff in num_dic:
                return [num_dic[diff],i]
            num_dic[num] = i
        return []