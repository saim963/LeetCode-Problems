class Solution {
    public int search(int[] nums, int target) {
        //Find the pivot of the array
        //pivot is where your next nos. are asc
        //so find the pivot and apply BS on first half(0-p) else BS in second half(p+1, e)
        
        int pivot = pivotFunc(nums);
        //if pivots comes out to be -1 that  means the array was not rotated
        if(pivot==-1)   return binarySearch(nums,target,0,nums.length-1);
        //case 1 target == pivot ele
        else if(nums[pivot]==target)    return pivot;
        //case 2 target on RHS of pivot ele
        else if(target>=nums[0])     return binarySearch(nums,target,0,pivot-1);
        //case 3 traget on LHS of pivot ele
        else return binarySearch(nums,target,pivot+1,nums.length-1);
        
    }
    //BS function
    int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>target)    end=mid-1;
            else if(nums[mid]<target)   start=mid+1;
            else    return mid;
        }
        return -1;
    }
    //function to find the pviot
    int pivotFunc(int[] nums){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //4cases here
            if(mid<end && nums[mid]>nums[mid+1])    return mid;
            else if(mid>start && nums[mid]<nums[mid-1])     return mid-1;
            else if(nums[start]>=nums[mid])     end=mid-1;
            else    start = mid+1;
        }
        return -1;
    }
}