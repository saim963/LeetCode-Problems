class Solution {
    public int maxProfit(int[] prices) {
        int maxPro =0;
        int currPro =0;
        int j =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]-prices[j] > 0) currPro=prices[i]-prices[j];
            else{
                currPro=0;
                j=i;
            }
            maxPro = Math.max(maxPro, currPro);
        }
        return maxPro;

    }
}