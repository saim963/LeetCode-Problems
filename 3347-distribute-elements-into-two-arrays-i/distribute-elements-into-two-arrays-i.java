class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2; i<n; i++){
            if(list1.get(list1.size()-1) > list2.get(list2.size()-1))       list1.add(nums[i]);
            else   list2.add(nums[i]);
        }
        int[] result = new int[n];
        int i=0, j=0;
        while(i<list1.size())   result[j++] = list1.get(i++);
        i=0;
        while(i<list2.size())   result[j++] = list2.get(i++);
        return result;
    }
}