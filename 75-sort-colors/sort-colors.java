class Solution {
    public void sortColors(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int i=0;
        while(i<=end){
            if(nums[i]==0){
                swap(nums,i,start);
                start++;
            }
            if(nums[i]==2){
                swap(nums,i,end);
                end--;
            }
            else i++;
        }
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}