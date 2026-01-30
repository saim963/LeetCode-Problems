class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        compare_set = set(nums)
        return len(compare_set)!=len(nums)