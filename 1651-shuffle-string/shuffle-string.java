class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i=0; i<indices.length; i++){
            // result[i] = s.charAt(indices[i]); //I tried but this isn't working thats bad
            result[indices[i]] = s.charAt(i);//yeah on dry run this makes sense too 
        }
        return new String(result);
    }
}