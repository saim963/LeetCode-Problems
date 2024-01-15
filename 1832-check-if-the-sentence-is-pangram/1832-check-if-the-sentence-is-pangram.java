class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
            charSet.add(sentence.charAt(i));
        }
        return charSet.size()==26;
    }
}