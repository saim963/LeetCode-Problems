class Solution {
    public boolean isHappy(int n) {
        //Check notes
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int temp = n%10;
                sum += temp*temp;
                n/=10;
            }
            n = sum;
        }
        return n == 1;
    }
}