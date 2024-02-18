class Solution {
    public int smallestEvenMultiple(int n) {
        //smallest multiple of 2 and n
        if(n%2==0)  return n;
        return 2*n;
    }
}