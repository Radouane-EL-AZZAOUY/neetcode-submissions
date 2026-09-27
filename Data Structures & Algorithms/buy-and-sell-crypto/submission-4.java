class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
                max = i;
            } else if (prices[i] > prices[max]) {
                max = i;
            }
            int profit = prices[max] - prices[min];
            if (maxProfit < profit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}
