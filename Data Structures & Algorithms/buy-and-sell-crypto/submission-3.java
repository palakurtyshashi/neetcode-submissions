class Solution {
    public int maxProfit(int[] prices) {
        //using dynamic programming
        int mp = 0;
        int minSoFar = prices[0];
        for(int sell: prices){
            minSoFar = Math.min(minSoFar,sell);
            mp = Math.max(mp, sell - minSoFar);
        }
        return mp;
    }
}
