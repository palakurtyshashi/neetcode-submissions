class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tFreq = new HashMap<>();
        for (Character c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int have = 0;
        int count = tFreq.size();
        int[] res = new int[2];
        int resLen = Integer.MAX_VALUE;
        Map<Character, Integer> wfMap = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            wfMap.put(s.charAt(r), wfMap.getOrDefault(s.charAt(r), 0) + 1);
            if (tFreq.containsKey(s.charAt(r))
                && tFreq.get(s.charAt(r)) == wfMap.get(s.charAt(r))) {
                have++;
            }
            while (have == count) {
                if (r - l + 1 < resLen) {
                    res[0] = l;
                    res[1] = r;
                    resLen = r - l + 1;
                }
                wfMap.put(s.charAt(l), wfMap.getOrDefault(s.charAt(l), 0) - 1);
                if (tFreq.containsKey(s.charAt(l))
                    && tFreq.get(s.charAt(l)) > wfMap.get(s.charAt(l))) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
