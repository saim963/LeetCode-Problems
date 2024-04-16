class Solution {
    public int maxProfit(int[] prices) {
        int currPro =0;
        int maxPro =0;
        for(int i=1; i<prices.length; i++){
            currPro += prices[i]-prices[i-1];
            if(currPro<0)   currPro=0;
            maxPro = Math.max(currPro,maxPro);
        }
        return maxPro;
    }
}