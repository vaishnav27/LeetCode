class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int[] row_max = new int[n];
        int[] col_max = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                row_max[i] = Math.max(row_max[i], grid[i][j]);
                col_max[j] = Math.max(col_max[j], grid[i][j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(row_max[i], col_max[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
