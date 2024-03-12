class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];//here the constraints are small, but maps should be used for bigger constraints
        int maxF = 0;
        for(int ele: nums){
            arr[ele]++;
            maxF = Math.max(maxF,arr[ele]);
        }
        int result =0;
        for(int ele: arr){
            if(ele==maxF){
                result +=maxF ;
            }   
        }
        return result;
    }
}