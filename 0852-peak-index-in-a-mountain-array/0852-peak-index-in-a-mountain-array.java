class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //the brute force method
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
    }
}