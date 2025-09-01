class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        #Sometimes things are easier than we think
        #initializing the variables current sum and the best sum
        #k is fixed so the best and current sum is well suited at summation of k elements
        curr = best = sum(nums[:k])
        #looping through the remaining elements
        for r in range(k,len(nums)):
            #Now when r is moving forward exceeding k, we delete the elements from left side
            #This addition and deletion is to maintain lenght k of sliding window
            curr = curr + nums[r] - nums[r-k]
            #getting the maimum value from both best and curr
            best = max(best,curr)
        #returning the average of bests subarray
        return best/k
