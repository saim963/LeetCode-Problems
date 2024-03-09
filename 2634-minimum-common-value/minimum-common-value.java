class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Brute Force method O(N^2) & O(1) -> TLE
        // int min = 0;
        // for(int ele1: nums1){
        //     for(int ele2: nums2){
        //         if(ele1==ele2)  return ele1;
        //     }
        // }
        // return -1;

        //hashSet
        HashSet<Integer> checker = new HashSet<>();
        for(int ele: nums1){
            checker.add(ele);
        }
        for(int num: nums2){
            if(checker.contains(num))  return num;
        }
        return -1;
    }
}