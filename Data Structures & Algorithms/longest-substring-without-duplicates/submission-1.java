class Solution {
    public int lengthOfLongestSubstring(String s) {
        // brute force

        int res = 0;

        int l = 0;
        Set<Character> myset = new HashSet();
        for (int r = 0; r < s.length(); r++) {
            while (myset.contains(s.charAt(r))) {
                myset.remove(s.charAt(l));
                l++;
            }
            myset.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        res = Math.max(res, myset.size());

        return res;
    }
}
