class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(start > prices[i]) start = prices[i];
            else if(prices[i] > start) {
                int profit = prices[i] - start;
                if(profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
}