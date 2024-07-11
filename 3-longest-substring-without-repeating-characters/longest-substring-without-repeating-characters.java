class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            int index = sb.indexOf(""+ch);
            if(index != -1){
                count = Math.max(sb.length(),count);
                sb.delete(0, index + 1);
            }
            sb.append(ch);
        }
        count = Math.max(sb.length(),count);
        return count;
    }
}