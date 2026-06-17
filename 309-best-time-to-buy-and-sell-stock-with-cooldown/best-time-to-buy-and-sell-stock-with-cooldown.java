class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int held = -prices[0];
        int sold = 0;
        int reset = 0;

        for (int i = 1; i < prices.length; i++) {
            int prevHeld = held;
            int prevSold = sold;
            int prevReset = reset;
            held = Math.max(prevHeld, prevReset - prices[i]);
            sold = prevHeld + prices[i];
            reset = Math.max(prevReset, prevSold);
        }

     
        return Math.max(sold, reset);
    }
}