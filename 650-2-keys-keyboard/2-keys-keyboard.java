class Solution {
    public int minSteps(int n) {
        int count =0;
        int d =2;
        while(n>1){
            //if d ia prime factor add to ans and keep diving else increase d
            while(n%d == 0){
                count += d;
                n /= d;
            }
            d++;
        }
        return count;
    }
}