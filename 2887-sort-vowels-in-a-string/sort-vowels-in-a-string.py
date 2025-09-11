class Solution:
    def sortVowels(self, s: str) -> str:
        #Describing a vowel set to compare characters from here
        vowel = set("aeiouAEIOU")
        #list comprehension to create a list with vowels from string s
        extracted = [ch for ch in s if ch in vowel]
        #Sorting the extracted list
        extracted.sort()

        #Creating the result list which will store the final string
        result = []
        #index variable initiated 
        idx = 0
        #running for loop through the string 
        for ch in s:
            #if the character in string is a vowel
            if ch in vowel:
                #append etracted element into the result list
                result.append(extracted[idx])
                #increment the index
                idx+=1
            else:
                #else just apppend the character form the original string
                result.append(ch)
        #convert the list into the string using join function
        return ''.join(result)