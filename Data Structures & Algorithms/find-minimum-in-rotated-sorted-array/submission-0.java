class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        int result = nums[0];
        while (l <= r) {
            if (nums[l] < nums[r]) {
                result = Math.min(nums[l], result);
                return result;
            }

            int mid = l + (r - l) / 2;
            result = Math.min(result, nums[mid]);

            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }
}
