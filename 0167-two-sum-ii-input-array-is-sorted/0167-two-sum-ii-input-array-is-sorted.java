class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int sum = numbers[start] + numbers[end];
            //here instead of mid element i used sum to compare
            if(sum > target){//if sum is greater than target we we goto starting side
                end--;
            }else if(sum < target){//else we got to endinng side
                start++;
            }else{//here we acknowledge equilibrium and prints ans in 1s index
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }
        }
        return new int[]{-1, -1};
    }
}