class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int k=0;
        int[] sumArr = new int[accounts.length];
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            sumArr[k] = sum;
            k++;
            sum=0;
        }
        //get max item from arrSum
        int maxVal = sumArr[0];
        for(int i=1; i<sumArr.length; i++){
            if(sumArr[i]>maxVal){
                maxVal = sumArr[i];
            }
        }
        return maxVal; 
    }    
}