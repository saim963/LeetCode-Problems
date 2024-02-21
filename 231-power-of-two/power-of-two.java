class Solution {
    public boolean isPowerOfTwo(int n) {
        //check whether n is power of 2
        return  (Math.log10(n)/Math.log10(2))%1==0;
    }
}