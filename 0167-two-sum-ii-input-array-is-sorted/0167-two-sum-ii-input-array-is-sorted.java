class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int sum = numbers[start] + numbers[end];//17,13
            if(sum > target){//T
                end--;//e=2
            }else if(sum < target){
                start++;
            }else{
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }
        }
        return new int[]{-1, -1};
    }
}