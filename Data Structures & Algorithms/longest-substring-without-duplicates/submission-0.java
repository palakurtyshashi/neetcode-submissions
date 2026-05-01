class Solution {
    public int lengthOfLongestSubstring(String s) {
        // brute force

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> myset = new HashSet();
            for (int j = i; j < s.length(); j++) {
                if (myset.contains(s.charAt(j)))
                    break;

                myset.add(s.charAt(j));
            }
            res = Math.max(res, myset.size());
        }
        return res;
    }
}
