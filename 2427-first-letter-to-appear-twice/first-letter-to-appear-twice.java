class Solution {
    public char repeatedCharacter(String s) {

        HashMap<Character,Integer> checker = new HashMap<>();
        for(char ch: s.toCharArray()){
            checker.put(ch,checker.getOrDefault(ch,0)+1);
            if(checker.get(ch)==2)   return ch;
        }
        return '\0';
    }
}