class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }
        int result = 0;
        for (Integer n : nums) {
            int length = 0;
            if (!numSet.contains(n - 1)) {
                while (numSet.contains(n + length)) {
                    length++;
                }
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
