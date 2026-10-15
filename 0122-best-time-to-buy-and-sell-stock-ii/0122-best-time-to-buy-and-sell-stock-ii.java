class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        for(int i =0;i<prices.length-1;i++){
            int j = i+1;
            int sell  = 0; 
            if(prices[i] < prices[j]){
                sell = prices[j] -prices[i];
            }
            p +=sell;
        }
        return p;
    }
}