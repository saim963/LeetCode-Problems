class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //m,n are representing number of elements in array
        //first concatenate and then sort
        for(int i=0; i<nums2.length; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}