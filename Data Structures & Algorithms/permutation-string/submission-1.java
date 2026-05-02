class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // using sliding window
        if (s1.length() > s2.length())
            return false;
        int l = 0;

        // build frequency
        int[] f1 = new int[26];
        for (Character c : s1.toCharArray()) {
            f1[c - 'a']++;
        }

        int[] f2 = new int[26];

        // sliding window size
        int ws = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            f2[s2.charAt(i) - 'a']++;

            if (i >= ws) {
                f2[s2.charAt(i - ws) - 'a']--;
            }
            if (Arrays.equals(f1, f2))
                return true;
        }
        return false;
    }
}
