class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // means return common subarray
        HashSet<Integer> set1 = new HashSet<>();// 1 2
        HashSet<Integer> intersectSet = new HashSet<>(set1);
        for (int num1 : nums1)      set1.add(num1);
        for (int num2 : nums2) {
            if(set1.contains(num2))     intersectSet.add(num2);
        }
        int[] result = new int[intersectSet.size()];
        int i =0;
        for(int element: intersectSet){
            result[i] = element;
            i++;
        }
        return result;
    }
}