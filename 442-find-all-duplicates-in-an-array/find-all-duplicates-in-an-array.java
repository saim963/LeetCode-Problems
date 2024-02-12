class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1)   list.add(nums[i]);
        }
        return list;
    }
    void sort(int[] arr){
        int i=0;
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