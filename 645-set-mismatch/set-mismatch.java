class Solution {
    public int[] findErrorNums(int[] nums) {
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1)     return new int[]{nums[i],i+1};
        }
        return  new int[]{0,0};
    }
    void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])    swap(arr,i,correct);
            else i++;
        }
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}