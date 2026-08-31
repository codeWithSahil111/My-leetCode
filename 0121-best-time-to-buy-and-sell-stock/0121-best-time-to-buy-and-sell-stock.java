class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0], len = prices.length;
        for(int i = 1; i< len; i++){
            int sell = prices[i];
            if(sell > buy){
                profit = Math.max(profit, sell - buy);
            }
            else buy = sell;
        }
        return profit;
    }
}