class Solution {
    // using sorting and two pointer left and right
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // we dont have to go till last as we need minimum three numbers
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // early pruning
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0)
                break;
            if (nums[i] + nums[n - 1] + nums[n - 2] < 0)
                continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
