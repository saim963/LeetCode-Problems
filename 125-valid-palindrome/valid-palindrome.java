class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        String x =s.toLowerCase();//every element is in lowercase
        System.out.println(x);
        //non-alphabetical characters
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)>=(char)48 && x.charAt(i)<=(char)57 || x.charAt(i)>=(char)97 && x.charAt(i)<=(char)122){
                builder.append(x.charAt(i));
            }
        }
        System.out.println(builder);
        return builder.toString().contentEquals(builder.reverse());
    }
}