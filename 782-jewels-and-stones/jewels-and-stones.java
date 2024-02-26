class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(Character ch: jewels.toCharArray()){
            set.add(ch);
        }
        for(Character ele: stones.toCharArray()){
            if(set.contains(ele))   count++;
        }
        return count;
    }
}