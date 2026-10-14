class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
        return 0;
        int maxProfit = 0;
        int profit = 0;
        int buyPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            profit = prices[i]-buyPrice;
            if(profit < 0){
                buyPrice = prices[i];
                profit = 0;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
