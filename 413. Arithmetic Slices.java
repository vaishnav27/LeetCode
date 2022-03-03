class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;

        for (int i = 0; i < nums.length - 1; i++) {
            int x = nums[i + 1] - nums[i];
            if (nums[i + 1] - nums[i] == x) {
                count++;
            }
        }
        return count;
    }
}
