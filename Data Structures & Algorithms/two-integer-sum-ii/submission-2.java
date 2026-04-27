class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // using hashmap with T o(n) and S o(n)

        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int pair = target - numbers[i];
            if (tempMap.containsKey(pair)) {
                return new int[] {tempMap.get(pair), i + 1};
            } else {
                tempMap.put(numbers[i], i + 1);
            }
        }
        return new int[] {0, 0};
    }
}
