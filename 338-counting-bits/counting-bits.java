class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<n+1; i++){
            ans[i] = hammingWeight(i);
        }
        return ans;
    }
    int hammingWeight(int n){
        int count =0;
        int check =0;
        while(n!=0){
            check = n&1;
            if(check==1)    count++;
            n>>=1;
        }
        return count;
    }
}