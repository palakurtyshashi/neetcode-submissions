class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int l = 0, r = 1;
        while (r < prices.length) {
            if(prices[r]>prices[l]){
                mp = Math.max(mp, prices[r]-prices[l]);
            }
            else{
                l = r;
            }
            r++;
        }
        return mp;
    }
}
