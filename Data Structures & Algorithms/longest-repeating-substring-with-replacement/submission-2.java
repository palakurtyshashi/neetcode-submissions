class Solution {
    public int characterReplacement(String s, int k) {
        // optimal sliding window T o(n) S o(m)

        Map<Character, Integer> charMap = new HashMap<>();

        int l = 0, maxf = 0, res=0;
        for (int r = 0; r < s.length(); r++) {
            charMap.put(s.charAt(r), charMap.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, charMap.get(s.charAt(r)));

            while(r-l+1 - maxf > k){
                charMap.put(s.charAt(l), charMap.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
