class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int i=0;
        while(i<=high){
            if(nums[i]==0){
                swap(i,low,nums);
                i++;
                low++;
            }
            else if(nums[i]==2){
                swap(i,high,nums);
                high--;
            }
            else    i++;
        }
    }
    public void swap(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}