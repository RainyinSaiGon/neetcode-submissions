class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minValue = 101;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i - 1]);
            profit = prices[i] - minValue;
            ans = Math.max(ans, profit);
        }

        return Math.max(ans, 0);
    }
}
