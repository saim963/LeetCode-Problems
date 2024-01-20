class Solution {
    public int mySqrt(int x) {
    int count = 0;
    int odd = 1;
        while(x>0){
            x = x-odd;
            if(x<0)
                return count;
            odd+=2;
            count++;
        }
        return  count;
    }
}