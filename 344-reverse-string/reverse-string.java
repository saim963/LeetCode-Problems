class Solution {
    public void reverseString(char[] s) {
        /*
         * int j=0;
         * int l=s.length;
         * char[] r = new char[l];
         * for(int i=l-1; i>=0; i--){
         * r[j]=s[i];
         * j++;
         * }//Problem with this code is SC should be O(1);
         */
        // reverse by swapping or using collection.reverse() method or two pointers
        char temp;
        for(int i=0; i<s.length/2; i++){
            temp = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
    }
}