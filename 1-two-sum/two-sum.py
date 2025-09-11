class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #Dictionray to store seen numbers and their indexes
        num_dic = {}
        #Enumerating through the nums list
        for i,num in enumerate(nums):
            #calculating diff for each num
            diff = target - num
            #if diff is in num dictionary 
            if diff in num_dic:
                #we call the index of the diff and current index
                return [num_dic[diff],i]
            #else we store the current number with index
            num_dic[num] = i
        #In case no solution found
        return []