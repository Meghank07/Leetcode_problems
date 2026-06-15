class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int profit = 0;
        int price = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            profit = Math.max(profit,prices[i]-price);
            price = Math.min(price,prices[i]);
        }
        return profit;
    }
}