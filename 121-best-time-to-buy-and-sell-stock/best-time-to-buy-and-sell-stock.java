class Solution {
    public int maxProfit(int[] prices) {
        int buy =0;
        int sell =1;
        int currPro =0;
        int maxPro =0;
        if(prices.length == 1)   return 0;
        for(int i =0; i< prices.length-1; i++){
            if(prices[sell] - prices[buy] < 0){
                buy = sell;
            } else {
                currPro = prices[sell] - prices[buy];
                maxPro = Math.max(currPro,maxPro);
            }
            sell++;
        }
        return maxPro;
    }
}