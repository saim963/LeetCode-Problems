class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        #We describe a character set 
        char_set = set()
        #We initiate the max len and left pointer from 0
        max_len, l = 0,0
        #iterating through the string using right pointer
        for r in range(len(s)):
            #In case we get element in the char set
            while s[r] in char_set:
                #we will start removing the elements from the other side
                char_set.remove(s[l])
                #and start incrementing the left pointer
                l += 1
            #Once all duplicates are removed, we start adding new elements
            char_set.add(s[r])
            #Once the removing and adding is done we then compare the max length
            max_len = max(max_len,r-l+1)
        #In the end we return the maximum length of the max set
        return max_len