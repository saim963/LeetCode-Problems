class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);
        return nums[nums.length-1];
    }
    void sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])  swap(arr, i, correct);
            else i++;
        }
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}