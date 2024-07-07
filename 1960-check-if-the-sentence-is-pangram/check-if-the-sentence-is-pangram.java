class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch = 'a';
        for(int i =0; i<26; i++){
            if(sentence.contains(String.valueOf(ch)))  ch++;
            else return false;   
        }
        return true;
    }
}