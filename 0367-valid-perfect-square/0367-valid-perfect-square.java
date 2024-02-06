class Solution {
    public boolean isPerfectSquare(int num) {
        int odd = 1;
        int count = 0;
        while(num>0){
            num = num-odd;
            if(num<0) return false;
            odd +=2;
            count++;
        }
        return true;
    }
}