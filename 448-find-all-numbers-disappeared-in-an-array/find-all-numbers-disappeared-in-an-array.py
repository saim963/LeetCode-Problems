class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ret = []
        unique = set(nums)
        for i in range(1,len(nums)+1):
            if i not in unique:
                ret.append(i)
        return ret    