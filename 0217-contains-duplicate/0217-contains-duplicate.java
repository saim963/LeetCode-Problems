class Solution {
    public boolean containsDuplicate(int[] nums) {
    /*
        Arrays.sort(nums);
        int count = 0;
        for(int i=0 ; i<nums.length-1; i++){
            if(nums[i]==nums[i+1])
                count++;
        }
        return count == 0 ? false : true;
    */
        //using hashset
        HashSet<Integer> set = new HashSet<>();
        for(int element: nums){
            if(set.contains(element))
                return true;
            set.add(element);
        }
        return false;
    }
    
}