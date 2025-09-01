class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        #defining l-pointer and cur-current sum
        l,cur = 0,0
        #minimum length is initiatedd with maximum possible number
        min_len = float('inf')
        #Looping through the list this is how we increase size of sliding window
        for r in range(len(nums)):
            #While r is moving forward the current sum is incrementing
            cur += nums[r]
            #In case current sum exceeds the target value 
            while cur >= target:
                #At that very moment we captures the length of the subarray
                min_len = min(min_len,r-l+1)
                #Now reducing the value of subarray by reducing the left pointer element
                cur -= nums[l]
                #moving the left pointer forward
                l += 1
        #returning the minimum lenght of the subarray, incase the min_value was not upgraded
        #In case the array didn't have any subarray to sum till target we return 0
        return min_len if min_len!=float('inf') else 0