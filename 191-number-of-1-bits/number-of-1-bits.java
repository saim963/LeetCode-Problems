class Solution {
    public int hammingWeight(int n) {
        int count =0;
        int check = 0;
        while(n!=0){
            check = n & 1;
            if(check==1)    count++;
            n>>=1;
        }
        return count;
    }
}