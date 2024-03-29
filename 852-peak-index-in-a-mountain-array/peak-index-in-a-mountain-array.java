class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*
        //the brute force method -> linear search
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
        */
        /*
        //One more simple solution but not optimised
        int i=0;
        while(arr[i]<arr[i+1])
            i++;
        return i;
        */
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}