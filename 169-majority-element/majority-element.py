class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # Creating a dictionary to store count of elements
        dic = {}
        #iterating through list
        for ch in nums:
            #each unique element is stored in the dic, ele as key and freq as value
            dic[ch] = dic.get(ch, 0) + 1

        # Find element with maximum frequency
        for key, val in dic.items():
            if val > len(nums) // 2:
                return key