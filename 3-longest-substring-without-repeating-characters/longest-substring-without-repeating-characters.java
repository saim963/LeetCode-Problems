class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, maxLen=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) >= l){
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            maxLen = Math.max(maxLen,r-l+1);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
}