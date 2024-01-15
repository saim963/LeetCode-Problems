class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int number: nums){
            if(digits(number)%2==0)
                count++;
        }
        return count;
    }
    int digits(int num){
        if(num<0)
            num*=-1;
        return (int)(Math.log10(num)) + 1;
    }
}