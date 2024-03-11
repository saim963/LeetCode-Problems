class Solution {
    public String customSortString(String order, String s) {

        //Return again to understand must needed 

        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        char letter = 'a';
        int length = 0;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<order.length(); i++){
            if(arr[order.charAt(i)-'a'] > 0){
                letter = order.charAt(i);
                length = arr[order.charAt(i)-'a'];
                for(int j=0; j<length; j++){
                    result.append(letter);
                    arr[letter-'a']--;
                }
            }
        }
        for(int i=0; i<26; i++){
            if(arr[i]>0){
                for(int j=0; j<arr[i]; j++){
                    result.append((char)(i+'a'));
                }
            }
        }
        return result.toString();
    }
}