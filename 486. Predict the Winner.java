class Solution {
    int[][][] dp = new int[22][22][2];

    public int findTheWinner(int[] nums, int i, int j, int chance) {
        if (i > j)
            return 0;
        if (dp[i][j][chance] != -1) {
            return dp[i][j][chance];
        }
        if (chance == 0) {
            return dp[i][j][chance] = Math.max(nums[i] + findTheWinner(nums, i + 1, j, 1),
                    nums[j] + findTheWinner(nums, i, j - 1, 1));
        } else {
            return dp[i][j][chance] = Math.min(findTheWinner(nums, i + 1, j, 0), findTheWinner(nums, i, j - 1, 0));
        }
    }

    public boolean PredictTheWinner(int[] nums) {
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 22; j++) {
                for (int j2 = 0; j2 < 2; j2++) {
                    dp[i][j][j2] = -1;
                }
            }
        }
        int n = nums.length;
        int playerTwo = 0;
        for (int i = 0; i < n; i++) {
            playerTwo += nums[i];
        }
        int playerOne = findTheWinner(nums, 0, n - 1, 0);
        playerTwo -= playerOne;

        return playerOne >= playerTwo;
    }
}
