class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!Objects.equals(map1.put(s.charAt(i), i), map2.put(t.charAt(i), i)))  return false;
        }
        return true;
    }
}