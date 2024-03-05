class Solution {
    public int mostWordsFound(String[] sentences) {
        //Array of strings, cal words in string and return max
        int words = 0;
        int maxW = 0;
        for( String ele: sentences){
            String[] str = ele.split(" ");
            words = str.length;
            maxW = Math.max(words,maxW);
        }
        return maxW;
    }
}