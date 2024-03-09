class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> checker = new HashMap<>();
        for(char ch: s.toCharArray()){
            checker.put(ch,checker.getOrDefault(ch,0)+1);
        }  
        for(int i=0; i<s.length(); i++){
            if(checker.get(s.charAt(i))==1)  return i;
        }
        return -1;
    }
}