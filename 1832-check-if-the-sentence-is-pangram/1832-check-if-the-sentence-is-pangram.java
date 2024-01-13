class Solution {
    public boolean checkIfPangram(String sentence) {
        /*String checker = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.indexOf(checker.charAt(i)) == -1)//problem is the order here
                //and this does not handles the duplicate issue 
                return false;
        }
        return true;*/
        //will be using set here
        Set<Character> charSet = new HashSet<>();
        for(int i=0; i<sentence.length(); i++){
            charSet.add(sentence.charAt(i));
        }
        return charSet.size()==26;
    }
}