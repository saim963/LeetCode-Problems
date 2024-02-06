class Solution {
    public boolean isPerfectSquare(int num) {
        /*
        int odd = 1;
        int count = 0;
        while(num>0){
            num = num-odd;
            if(num<0) return false;
            odd +=2;
            count++;
        }
        return true;
        */
        if(num<0) return false;
        int start = 1;
        int end = num;
        while(start<=end){
            int mid = start+(end-start)/2;
            long square =(long) mid*mid;
            if(square > num){
                end = mid-1;
            }else if(square < num){
                start = mid+1;
            }else
                return true;
        }
        return false;
    }
}