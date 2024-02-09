class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x==reverse(x);
    }
    public int reverse(int n){
        int rev = 0;
        int min = Integer.MIN_VALUE/10;
        int max = Integer.MAX_VALUE/10;
        while(n!=0){
            if(rev>max || rev<min)  return 0;
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}