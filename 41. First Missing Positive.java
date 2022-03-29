class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = n + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);

            if (idx > n)
                continue;
            idx--;
            if (nums[idx] > 0)
                nums[idx] = -nums[idx];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return i + 1;
        }
        return n+1;
    }
}
