class Solution {
    public int singleNonDuplicate(int[] nums) {
        //each element twice, one element once find that element
        // int start=0;
        // int end=nums.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]==nums[mid+1]){
        //         start=m+2;
        //     }else if(nums[mid]==nums[mid-1]){
        //     }
        // }
        // return nums[mid];

        Map<Integer,Integer> map = new HashMap<>();
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int el: nums){
            if(map.get(el)==1) return el;
        }
        return -1;
    }
}