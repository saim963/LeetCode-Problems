class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for(String str1: word1){
            builder1.append(str1);
        }
        for(String str2: word2){
            builder2.append(str2);
        }
        return builder1.toString().equals(builder2.toString());
    }
}