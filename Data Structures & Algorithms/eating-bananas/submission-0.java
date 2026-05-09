class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int totalhrs = 0;
            for (int pile : piles) {
                totalhrs += Math.ceil((double) pile / mid);
            }

            if (totalhrs <= h) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
