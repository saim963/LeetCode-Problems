/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //isbad or not is checked by api
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid))//let us consider mid is faulty
                end = mid-1;
            else
                start = mid+1;
        }
        return start;
    }
} 