
class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];

        // Lopping throughout the arrayt
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                if (i == 1) {
                    dp[i] = true;
                    continue;
                }if (dp[i - 2]) {
                    dp[i] = true;
                } 
                else if (i > 1 && nums[i - 2] == nums[i - 1]) {
                    if (i == 2) {
                        dp[i] = true;
                    } else if (i > 2) {
                        dp[i] = dp[i - 3];
                    }
                }
               
            } else {
                if (i < 2) {
                    continue;
                }

                if (  nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1 ) {
                    if (i == 2)
                        dp[i] = true;
                    else
                        dp[i] = dp[i - 3];
                }
            }
        }

        return dp[n - 1];
    }
}
