class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int curr_max = 0;
        int i = 0, j = 0;

        while (i<nums.length) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                curr_max += nums[i];
                max = Math.max(max, curr_max);
                i++;
            } else {
                set.remove(nums[j]);
                curr_max -= nums[j];
                j++;
            }
        }
        return max;
    }
}
