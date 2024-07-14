class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n==1)  arr[0] = 0;
        int sum =0;
        for(int i=0; i<n-1; i++){
            arr[i] = i+1;
            sum += arr[i];
        }
        arr[n-1] = -sum;
        return arr;
    }
}