class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int count=0;
        // HashSet<Character> set = new HashSet<>();
        // for(Character ch: jewels.toCharArray()){
        //     set.add(ch);
        // }
        // for(Character ele: stones.toCharArray()){
        //     if(set.contains(ele))   count++;
        // }
        // return count;

        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        for(int j=0; j<stones.length(); j++){
            if(set.contains(stones.charAt(j))) count++;
        }
        return count;
    }
}