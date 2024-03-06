class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // int count=0 ;
        // for(int num: hours) if(num>=target) count++;
        // return count;


        //More optimized
        return (int) IntStream.of(hours).filter(hour -> hour >= target).count();
    }
}