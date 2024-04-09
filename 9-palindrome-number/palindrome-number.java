class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x==reverse(x);
    }
    public int reverse(int x) {
        int rev=0;
        int min = Integer.MIN_VALUE/10;
        int max = Integer.MAX_VALUE/10;
        while(x!=0){
            if(rev>max || rev<min)  return 0;
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev;
    }
}