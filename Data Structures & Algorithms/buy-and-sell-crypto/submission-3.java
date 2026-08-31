class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int i = 0;
        int j = 1;
        int sell = 0;
        while(j < prices.length){
            if(prices[j] < prices[i]){
                i = j;
            }else{
                sell = Math.max(sell, prices[j] - prices[i]);
            }
            j++;
        }
        return sell;
    }
}
