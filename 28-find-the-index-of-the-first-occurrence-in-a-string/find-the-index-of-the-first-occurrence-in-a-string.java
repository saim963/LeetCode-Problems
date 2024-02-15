class Solution {
    public int strStr(String haystack, String needle) {
        //first index of occurance of needle in haystack
        StringBuilder builderStack = new StringBuilder(haystack);
        int ans = builderStack.indexOf(needle);
        return ans;
    }
}