class Solution {
    public int missingNumber(int[] nums) {
        /*
        //cyclic sort as 0-n 
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct])    swap(nums,i,correct);
            else i++;
        }
        //serach for first missing
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index) return index;
        }
        //case 2
        return nums.length;
        */

        //second basic appproach
        int n = nums.length;
        int sumN=n*(n+1)/2;
        int sumI = 0;
        for(int num: nums)      
            sumI += num;
        return sumN-sumI;
    }
    /*
    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    */
    
}