class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        int maxSum =0;
        for(int[] arr: accounts){
            sum=0;
            for(int j=0; j<arr.length; j++){
                sum +=arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum; 
    }
}