class Solution {
    public int maxProfit(int[] prices) {
        // int b =0;
        // int s =1;
        // int currPro =0;
        // int maxPro =0;
        // if(prices.length == 1)  return 0;
        // for(int i=0; i<prices.length-1; i++){
        //     maxPro = Math.max(maxPro,currPro);
        //     if(prices[s]-prices[b] < 0){
        //         currPro=0;
        //         b=s;
        //         s++;
        //     }else if(prices[s]-prices[b] > 0)  {
        //         currPro = prices[s]-prices[b];
        //     }
        // }
        // return maxPro;

        int buy =0;
        int sell =1;
        int currPro =0;
        int maxPro =0;
        if(prices.length == 1)   return 0;
        for(int i =0; i< prices.length-1; i++){
            if(prices[sell] - prices[buy] < 0){
                buy = sell;
                sell++;
            } else {
                currPro = prices[sell] - prices[buy];
                maxPro = Math.max(currPro,maxPro);
                sell++;
            }
        }
        return maxPro;
    }
}