  class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                evenSum += nums[i];
        }
        int[] ans = new int[nums.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int updatedVal = queries[i][0];

            if (nums[index] % 2 == 0) {
                evenSum -= nums[index];
            }
            nums[index] = nums[index] + updatedVal;

            if (nums[index] % 2 == 0)
                evenSum += nums[index];

            ans[i] = evenSum;
        }
        return ans;
    }
}
