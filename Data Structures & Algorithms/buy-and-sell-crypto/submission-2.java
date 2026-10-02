class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        if(prices.length == 1)
        return 0;

        while(left < right && right < prices.length){
            profit = prices[right]-prices[left];
            if(profit < 0){
                profit = 0;
                left = right;
            }
            if(profit > maxProfit){
                maxProfit = profit;
            }
            right++;
        }
        return maxProfit;
        
    }
}
