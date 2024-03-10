class Solution {
    public int addDigits(int num) {
        //add all digits until result has 1 digit
        while(num>=10){
            int temp = num%10;
            num/=10;
            num += temp;
        }
        return num;
    }
}