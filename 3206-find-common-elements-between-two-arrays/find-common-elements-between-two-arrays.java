class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1=0;
        int count2=0;
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(nums1[i]==nums2[j]){
                    count1++;
                    break;
                }  
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(nums2[i]==nums1[j]){
                    count2++;
                    break;
                }  
            }
        }
        return new int[]{count1,count2};
    }
}