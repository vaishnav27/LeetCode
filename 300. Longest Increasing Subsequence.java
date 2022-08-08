class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        return fun(-1, 0, nums,dp);
    }

    public int fun(int prev, int cur, int[] nums,int[][] dp) {
        if (cur == nums.length) {
            return 0;
        }
        if (prev != -1 && dp[prev][cur] != 0) {
            return dp[prev][cur];
        }
        int choice1 = 0;
        if (prev == -1 || nums[prev] < nums[cur]) {
             choice1 = 1 + fun(cur, cur + 1, nums,dp);
        }
        int choice2 =fun(prev, cur + 1, nums,dp);
        if (prev != -1) {
            dp[prev][cur] = Math.max(choice1, choice2);
        }
        return Math.max(choice1, choice2);
    }
}
