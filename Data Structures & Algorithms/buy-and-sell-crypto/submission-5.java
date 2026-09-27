class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            } else {
                int profit = prices[i] - prices[min];
                if (maxProfit < profit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
