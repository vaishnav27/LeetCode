class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSUm = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1, hi = nums.length - 1;

            while (lo < hi) {
                int currSum = nums[i] + nums[lo] + nums[hi];

                if (currSum > target)
                    hi--;
                else
                    lo++;

                if (Math.abs(currSum - target) < Math.abs(closestSUm - target)) {
                    closestSUm = currSum;
                }
            }
        }
        return closestSUm;
    }
}
