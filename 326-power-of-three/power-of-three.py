class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n<=0:
            return False
        #keep dividing by 3 as logn as it is possible
        while n%3==0:
            n//=3

        return n==1