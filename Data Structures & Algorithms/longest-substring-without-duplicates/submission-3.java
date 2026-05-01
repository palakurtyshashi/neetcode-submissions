class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window optimal

        int res = 0, l = 0;
        Map<Character, Integer> myMap = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            if (myMap.containsKey(s.charAt(r))) {
                l = Math.max(l, myMap.get(s.charAt(r)) + 1);
            }
            myMap.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
