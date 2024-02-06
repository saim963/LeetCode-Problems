class Solution {
    public int mySqrt(int x) {
    int count = 0;
    int odd = 1;
        while(x>0){
            x = x-odd;//heres one method to find the sqrt in which we reduce odds till 0
            if(x<0)
                return count;//no of times we needed to redducee odd till 0
            odd+=2;
            count++;
        }
        return  count;
    }
}